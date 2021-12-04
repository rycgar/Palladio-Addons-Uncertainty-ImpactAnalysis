package org.palladiosimulator.uncertaintymodel.plugin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeAll;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.EntityFactory;
import org.palladiosimulator.uncertainty.impact.exception.LoadModelFailedException;
import org.palladiosimulator.uncertainty.impact.exception.PalladioElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.exception.UncertaintyTemplateElementNotFoundException;
import org.palladiosimulator.uncertainty.impact.model.PalladioModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyModel;
import org.palladiosimulator.uncertainty.impact.model.UncertaintyTemplateModel;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADD;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ADDClass;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AddFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.AmountOfAlternatives;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.CostsOfRevision;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.PossibilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.add.ProbabilityOfRevisability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypeFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.PalladioElementWrapper;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.Uncertainty;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertainty.UncertaintyFactory;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ImpactOnConfidentiality;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.InformationAvailability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Location;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Manageability;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.Nature;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.ResolutionTime;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.RootCause;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.SeverityOfImpact;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyType;
import org.palladiosimulator.uncertainty.impact.uncertaintymodel.uncertaintytype.UncertaintyTypeFactory;
import org.palladiosimulator.uncertainty.impact.view.model.ADDViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.PalladioElementViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyTypeViewModel;
import org.palladiosimulator.uncertainty.impact.view.model.UncertaintyViewModel;

import tools.mdsd.library.standalone.initialization.StandaloneInitializationException;

public abstract class TestBase {

	// Paths to Palladio Test Models
	public static String allocationPath = "src/test/resources/models/user/pcm/BookShop.allocation";
	public static String repositoryPath = "src/test/resources/models/user/pcm/BookShop.repository";
	public static String resourceEnvPath = "src/test/resources/models/user/pcm/BookShop.resourceenvironment";
	public static String systemPath = "src/test/resources/models/user/pcm/BookShop.system";
	public static String usageModelPath = "src/test/resources/models/user/pcm/BookShop.usagemodel";

	public static String uncertaintyPath = "src/test/resources/models/user/test.uncertainty";
	public static String uncertaintyTemplatePath = "src/test/resources/models/expert/test.uncertaintytemplate";

	public static List<String> palladioModelPaths = new ArrayList<>(
			List.of(allocationPath, repositoryPath, resourceEnvPath, systemPath, usageModelPath));

	public static String testDataPath = "src/test/resources/testdata/";

	private UncertaintyFactory uncertaintyFactory = UncertaintyFactory.eINSTANCE;

	private UncertaintyTypeFactory uncertaintyTypeFactory = UncertaintyTypeFactory.eINSTANCE;

	private EntityFactory entityFactory = EntityFactory.eINSTANCE;

	private AddFactory addFactory = AddFactory.eINSTANCE;

	private PalladioElementTypeFactory palladioElementTypeFactory = PalladioElementTypeFactory.eINSTANCE;

	public static BookStoreLoader bookStore;
	public static TestUncertaintyTemplateLoader testTemplateLoader;

	@BeforeAll
	public static void initTestEnvironment() throws StandaloneInitializationException, LoadModelFailedException {
		UncertaintyPluginInitializer.init();
		bookStore = new BookStoreLoader();
		testTemplateLoader = new TestUncertaintyTemplateLoader();
	}

	/**
	 * Do not execute before each test (only where necessary)
	 */
	public static void cleanTestData() {
		URI uri = URI.createFileURI(testDataPath);
		try {
			FileUtils.cleanDirectory(new File(uri.toString()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public UncertaintyTemplateModel getInitializedUncertaintyTemplateModel() throws LoadModelFailedException {
		UncertaintyTemplateModel loader = new UncertaintyTemplateModel();
		loader.loadUncertaintyTemplateModel(uncertaintyTemplatePath);
		return loader;
	}

	public static PalladioModel getInitializedPalladioModel() throws LoadModelFailedException {
		PalladioModel loader = new PalladioModel();
		loader.loadPalladioModels(palladioModelPaths);
		return loader;
	}

	public UncertaintyModel getInitializedUncertaintyModel() throws LoadModelFailedException {
		UncertaintyModel loader = new UncertaintyModel();
		loader.loadUncertaintyModel(uncertaintyPath);
		return loader;
	}

	/**
	 * Initialized with default uncertainty template
	 * 
	 * @return
	 * @throws LoadModelFailedException
	 */
	public UncertaintyModel getEmptyInitializedUncertaintyModel() throws LoadModelFailedException {
		UncertaintyModel model = new UncertaintyModel();
		model.loadNewUncertaintyModel(getInitializedUncertaintyTemplateModel().getTemplateModel());
		return model;
	}

	/**
	 * Create Uncertainty with provided characteristics
	 * 
	 * @param name
	 * @param uncertaintyType
	 * @param assignedElement
	 * @return
	 */
	public Uncertainty createUncertainty(String name, UncertaintyType uncertaintyType,
			PalladioElementWrapper assignedElement) {
		Uncertainty uncertainty = uncertaintyFactory.createUncertainty();
		uncertainty.setName(name);
		uncertainty.setUncertaintyType(uncertaintyType);
		uncertainty.setAssignedElement(assignedElement);

		return uncertainty;
	}

	/**
	 * Create Uncertainty with default type and assigned element
	 * 
	 * @param name
	 * @return
	 */
	public Uncertainty createUncertaintyWithDefaultValues(String name) {
		Uncertainty uncertainty = uncertaintyFactory.createUncertainty();
		uncertainty.setName(name);
		uncertainty.setUncertaintyType(createUncertaintyTypeWithDefaultValues("default"));
		uncertainty.setAssignedElement(createDefaultPalladioElementWrapper());

		return uncertainty;
	}

	public Uncertainty createUncertainty_Book_Store_at_system()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_system", testTemplateLoader.getUncertaintyType_Assignable_to_System(),
				createPalladioElementWrapper(bookStore.getSystem_Book_Shop_System()));

	}

	public Uncertainty createUncertainty_Book_Store_at_hardware_resource()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_hardware_resource",
				testTemplateLoader.getUncertaintyType_Assignable_to_HardwareResource(),
				createPalladioElementWrapper(bookStore.getHardwareResource_Web__Application_Server()));

	}

	public Uncertainty createUncertainty_Book_Store_at_basic_component_type()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_basic_component_type",
				testTemplateLoader.getUncertaintyType_Assignable_to_BasicComponentType(),
				createPalladioElementWrapper(bookStore.getBasicComponentType_Book_Shop_Web_Pages()));

	}

	public Uncertainty createUncertainty_Book_Store_at_component_instance()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_basic_component_instance",
				testTemplateLoader.getUncertaintyType_Assignable_to_ComponentInstance(),
				createPalladioElementWrapper(bookStore
						.getComponentInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider()));

	}

	public Uncertainty createUncertainty_Book_Store_at_basic_component_behaviour()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_basic_component_behaviour",
				testTemplateLoader.getUncertaintyType_Assignable_to_BasicComponentBehaviour(),
				createPalladioElementWrapper(bookStore.getBasicComponentBehaviour_home__Book_Shop_Web_Pages()));

	}

	public Uncertainty createUncertainty_Book_Store_at_communication_component()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_communication_component",
				testTemplateLoader.getUncertaintyType_Assignable_to_CommunicationComponents(),
				createPalladioElementWrapper(bookStore.getCommunicationComponent_IBusinessConnector()));

	}

	public Uncertainty createUncertainty_Book_Store_at_communication_resource()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_communication_resource",
				testTemplateLoader.getUncertaintyType_Assignable_to_CommunicationResources(),
				createPalladioElementWrapper(bookStore.getCommunicationResource_LAN()));

	}

	public Uncertainty createUncertainty_Book_Store_at_system_interface()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_system_interface",
				testTemplateLoader.getUncertaintyType_Assignable_to_SystemInterface(),
				createPalladioElementWrapper(bookStore.getSystemInterface_Provided_IBrowseBooks()));

	}

	public Uncertainty createUncertainty_Book_Store_at_component_interface_instance()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_component_interface_instance",
				testTemplateLoader.getUncertaintyType_Assignable_to_ComponentInterfaceInstance(),
				createPalladioElementWrapper(bookStore
						.getComponentInterfaceInstance_Assembly_Book__Customer_Data_Provider_Book__Customer_Data_Provider__IBook()));

	}

	public Uncertainty createUncertainty_Book_Store_at_component_interface_type()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_component_interface_type",
				testTemplateLoader.getUncertaintyType_Assignable_to_ComponentInterfaceType(),
				createPalladioElementWrapper(bookStore.getComponentInterfaceType_Provided_IBook()));

	}

	public Uncertainty createUncertainty_Book_Store_at_usage_behaviour()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_at_usage_behaviour",
				testTemplateLoader.getUncertaintyType_Assignable_to_UsageBehaviour(),
				createPalladioElementWrapper(bookStore.getUsageBehaviour_Load_Images()));

	}

	/**
	 * Uncertainty is invalid, as assignableElementType is 'System' and actually
	 * assigned element is of type BasicComponentBehaviour. This will not happen if
	 * using the UI but might happen if using the tree editor
	 * 
	 * @return
	 * @throws UncertaintyTemplateElementNotFoundException
	 * @throws PalladioElementNotFoundException
	 */
	public Uncertainty createUncertainty_Book_Store_Invalid_Mapping()
			throws UncertaintyTemplateElementNotFoundException, PalladioElementNotFoundException {
		return createUncertainty("uncertainty_invalid", testTemplateLoader.getUncertaintyType_Assignable_to_System(),
				createPalladioElementWrapper(
						bookStore.getBasicComponentBehaviour_addBook__Book__Customer_Data_Provider()));

	}

	public UncertaintyViewModel createUncertaintyViewModel(String name, String id,
			UncertaintyTypeViewModel uncertaintyTypeViewModel, PalladioElementViewModel palladioElementViewModel) {
		UncertaintyViewModel uncertaintyViewModel = new UncertaintyViewModel();
		uncertaintyViewModel.setName(name);
		uncertaintyViewModel.setId(id);
		uncertaintyViewModel.setUncertaintyTypeViewModel(uncertaintyTypeViewModel);
		uncertaintyViewModel.setAssignedElement(palladioElementViewModel);

		return uncertaintyViewModel;

	}

	/**
	 * Create uncertainty type with specified fields
	 * 
	 * @param name
	 * @param assignableElement
	 * @param resolvedByADD
	 * @param impactOn
	 * @param impactOnConfidentiality
	 * @param informationAvailability
	 * @param location
	 * @param manageability
	 * @param nature
	 * @param resolutionTime
	 * @param resolvableByAdd
	 * @param rootCause
	 * @param severityOfImpact
	 * @return
	 */
	public UncertaintyType createUncertaintyType(String name, PalladioElementType assignableElement, ADD resolvedByADD,
			List<PalladioElementType> impactOn, ImpactOnConfidentiality impactOnConfidentiality,
			InformationAvailability informationAvailability, Location location, Manageability manageability,
			Nature nature, ResolutionTime resolutionTime, RootCause rootCause, SeverityOfImpact severityOfImpact) {

		// Create type
		UncertaintyType uncertaintyType = uncertaintyTypeFactory.createUncertaintyType();

		// Set fields
		uncertaintyType.setName(name);
		uncertaintyType.setAssignableElementType(assignableElement);
		uncertaintyType.setResolvedBy(resolvedByADD);
		uncertaintyType.getImpactOn().addAll(impactOn);

		// Set enums
		uncertaintyType.setImpactOnConfidentiality(impactOnConfidentiality);
		uncertaintyType.setInformationAvailability(informationAvailability);
		uncertaintyType.setLocation(location);
		uncertaintyType.setManageability(manageability);
		uncertaintyType.setNature(nature);
		uncertaintyType.setResolutionTime(resolutionTime);
		uncertaintyType.setRootCause(rootCause);
		uncertaintyType.setSeverityOfImpact(severityOfImpact);

		return uncertaintyType;
	}

	public UncertaintyTypeViewModel createUncertaintyTypeViewModel(String name,
			PalladioElementTypeViewModel assignableElement, ADDViewModel resolvedByADD,
			List<PalladioElementTypeViewModel> impactOn, ImpactOnConfidentiality impactOnConfidentiality,
			InformationAvailability informationAvailability, Location location, Manageability manageability,
			Nature nature, ResolutionTime resolutionTime, RootCause rootCause, SeverityOfImpact severityOfImpact) {
		UncertaintyTypeViewModel uncertaintyTypeViewModel = new UncertaintyTypeViewModel();

		// Set fields
		uncertaintyTypeViewModel.setName(name);
		uncertaintyTypeViewModel.setAssignableElementType(assignableElement);
		uncertaintyTypeViewModel.setResolvedBy(resolvedByADD);
		uncertaintyTypeViewModel.getImpactOn().addAll(impactOn);

		// Set enums
		uncertaintyTypeViewModel.setImpactOnConfidentiality(impactOnConfidentiality.getName());
		uncertaintyTypeViewModel.setInformationAvailability(informationAvailability.getName());
		uncertaintyTypeViewModel.setLocation(location.getName());
		uncertaintyTypeViewModel.setManageability(manageability.getName());
		uncertaintyTypeViewModel.setNature(nature.getName());
		uncertaintyTypeViewModel.setResolutionTime(resolutionTime.getName());
		uncertaintyTypeViewModel.setRootCause(rootCause.getName());
		uncertaintyTypeViewModel.setSeverityOfImpact(severityOfImpact.getName());

		return uncertaintyTypeViewModel;
	}

	/**
	 * UncertaintyTypeViewModel with id and name set only
	 * 
	 * @param name
	 * @param id
	 * @return
	 */
	public UncertaintyTypeViewModel createUncertaintyTypeViewModelSkeleton(String name, String id) {
		UncertaintyTypeViewModel uncertaintyTypeViewModel = new UncertaintyTypeViewModel();

		// Set fields
		uncertaintyTypeViewModel.setName(name);
		uncertaintyTypeViewModel.setId(id);

		return uncertaintyTypeViewModel;
	}

	/**
	 * Create UncertaintaintyType with default values
	 * 
	 * @return
	 */
	public UncertaintyType createUncertaintyTypeWithDefaultValues(String name) {
		UncertaintyType uncertaintyType = uncertaintyTypeFactory.createUncertaintyType();
		uncertaintyType.setName(name);

		uncertaintyType.setResolvedBy(createADDWithDefaultValues("default"));
		uncertaintyType.setAssignableElementType(createPalladioElementTypeWithDefaultValues("default"));

		uncertaintyType.getImpactOn().add(createPalladioElementTypeWithDefaultValues("default"));

		return uncertaintyType;
	}

	/**
	 * Create Palladio Element Type with provided values
	 * 
	 * @param name
	 * @param type
	 * @return
	 */
	public PalladioElementType createPalladioElementType(String name, PalladioElementTypes type) {
		PalladioElementType palladioElementType = palladioElementTypeFactory.createPalladioElementType();
		palladioElementType.setName(name);
		palladioElementType.setType(type);

		return palladioElementType;
	}

	/**
	 * Create Palladio Element Type with default values
	 * 
	 * @param name
	 * @return
	 */
	public PalladioElementType createPalladioElementTypeWithDefaultValues(String name) {
		PalladioElementType palladioElementType = palladioElementTypeFactory.createPalladioElementType();
		palladioElementType.setName(name);
		palladioElementType.setType(PalladioElementTypes.BASIC_COMPONENT_TYPE);

		return palladioElementType;
	}

	public PalladioElementTypeViewModel createPalladioElementTypeViewModel(String id, String name,
			PalladioElementTypes type) {
		PalladioElementTypeViewModel palladioElementTypeViewModel = new PalladioElementTypeViewModel();
		palladioElementTypeViewModel.setId(id);
		palladioElementTypeViewModel.setName(name);
		palladioElementTypeViewModel.setType(type.getName());

		return palladioElementTypeViewModel;
	}

	public ADD createADD(String name, ADDClass addClass, AmountOfAlternatives amountOfAlternatives,
			CostsOfRevision costsOfRevision, PossibilityOfRevisability possibilityOfRevisability,
			ProbabilityOfRevisability probabilityOfRevisability) {
		ADD add = addFactory.createADD();

		add.setName(name);
		add.setAddClass(addClass);
		add.setAmountOfAlternatives(amountOfAlternatives);
		add.setCostsOfRevision(costsOfRevision);
		add.setPossibilityOfRevisability(possibilityOfRevisability);
		add.setProbabilityOfRevisability(probabilityOfRevisability);
		return add;
	}

	public ADD createADDWithDefaultValues(String name) {
		ADD add = addFactory.createADD();
		add.setName(name);
		return add;
	}

	public ADDViewModel createADDViewModel(String name, ADDClass addClass, AmountOfAlternatives amountOfAlternatives,
			CostsOfRevision costsOfRevision, PossibilityOfRevisability possibilityOfRevisability,
			ProbabilityOfRevisability probabilityOfRevisability) {
		ADDViewModel add = new ADDViewModel();

		add.setName(name);
		add.setAddClass(addClass.getName());
		add.setAmountOfAlternatives(amountOfAlternatives.getName());
		add.setCostsOfRevision(costsOfRevision.getName());
		add.setPossibilityOfRevisability(possibilityOfRevisability.getName());
		add.setProbabilityOfRevisability(probabilityOfRevisability.getName());
		return add;
	}

	/**
	 * Create Palladio Element Wrapper with default referenced entity & type
	 * 
	 * @return
	 */
	public PalladioElementWrapper createDefaultPalladioElementWrapper() {
		PalladioElementWrapper elementWrapper = uncertaintyFactory.createPalladioElementWrapper();
		Entity entity = entityFactory.createResourceInterfaceProvidingEntity();
		elementWrapper.setReferencedElement(entity);

		return elementWrapper;
	}

	public PalladioElementWrapper createPalladioElementWrapper(Entity entity) {
		PalladioElementWrapper elementWrapper = uncertaintyFactory.createPalladioElementWrapper();
		elementWrapper.setReferencedElement(entity);

		return elementWrapper;
	}

	public PalladioElementViewModel createPalladioElementViewModel(String id, String name) {
		PalladioElementViewModel palladioElementViewModel = new PalladioElementViewModel();
		palladioElementViewModel.setId(id);
		palladioElementViewModel.setName(name);

		return palladioElementViewModel;
	}

	public void testUncertainty(Uncertainty uncertainty, String id, String name, String uncertaintyTypeId,
			String uncertaintyTypeName, String referencedElementTypeId, String referencedElementTypeName) {
		assertEquals(id, uncertainty.getId());
		assertEquals(name, uncertainty.getName());
		assertEquals(uncertaintyTypeId, uncertainty.getUncertaintyType().getId());
		assertEquals(uncertaintyTypeName, uncertainty.getUncertaintyType().getName());
		assertEquals(referencedElementTypeId, uncertainty.getAssignedElement().getReferencedElement().getId());
		assertEquals(referencedElementTypeName,
				uncertainty.getAssignedElement().getReferencedElement().getEntityName());

	}

	public void testADD(ADD add, String id, String name, ADDClass addClass, AmountOfAlternatives amountOfAlternatives,
			CostsOfRevision costsOfRevision, PossibilityOfRevisability possibilityOfRevisability,
			ProbabilityOfRevisability probabilityOfRevisability) {
		
		testIdAndName(id, add.getId(),name, add.getName());
		assertEquals(addClass, add.getAddClass());
		assertEquals(amountOfAlternatives, add.getAmountOfAlternatives());
		assertEquals(costsOfRevision, add.getCostsOfRevision());
		assertEquals(possibilityOfRevisability, add.getPossibilityOfRevisability());
		assertEquals(probabilityOfRevisability, add.getProbabilityOfRevisability());
	}

	public void testPalladioElementType(PalladioElementType elementType, String id, String name,
			PalladioElementTypes type) {
		testIdAndName(id, elementType.getId(),name, elementType.getName());
		assertEquals(type, elementType.getType());
	}

	public void testUncertaintyType(UncertaintyType uncertaintyType, String id, String name,
			String palladioElementTypeId, List<String> impactOnElementIds, String resolvedByADDId,
			ImpactOnConfidentiality impactOnConfidentiality, InformationAvailability informationAvailability,
			Location location, Manageability manageability, Nature nature, ResolutionTime resolutionTime,
			RootCause rootCause, SeverityOfImpact severityOfImpact) {

		// Check basic fields
		testIdAndName(id, uncertaintyType.getId(), name, uncertaintyType.getName());

		// Check assignable element
		assertEquals(palladioElementTypeId, uncertaintyType.getAssignableElementType().getId());

		// Check impact on elements
		assertEquals(impactOnElementIds.size(), uncertaintyType.getImpactOn().size());
		List<String> actualImpactOnElementIds = uncertaintyType.getImpactOn().stream().map(x -> x.getId())
				.collect(Collectors.toList());
		assertTrue(actualImpactOnElementIds.containsAll(impactOnElementIds));

		// Check resolved by add
		if (resolvedByADDId != null) {
			assertEquals(resolvedByADDId, uncertaintyType.getResolvedBy().getId());
		} else {
			assertNull(uncertaintyType.getResolvedBy());
		}

		// Check enums
		assertEquals(uncertaintyType.getImpactOnConfidentiality(), impactOnConfidentiality);
		assertEquals(uncertaintyType.getInformationAvailability(), informationAvailability);
		assertEquals(uncertaintyType.getLocation(), location);
		assertEquals(uncertaintyType.getManageability(), manageability);
		assertEquals(uncertaintyType.getNature(), nature);
		assertEquals(uncertaintyType.getResolutionTime(), resolutionTime);
		assertEquals(uncertaintyType.getRootCause(), rootCause);
		assertEquals(uncertaintyType.getSeverityOfImpact(), severityOfImpact);

	}

	public void testADDEqualsADDViewModel(ADD add, ADDViewModel addViewModel) {
		if (add == null || addViewModel == null) {
			assertNull(addViewModel);
			assertNull(addViewModel);
		} else {
			assertNotNull(addViewModel);
			assertNotNull(addViewModel);
			
			testIdAndName(add.getId(), addViewModel.getId(), add.getName(), addViewModel.getName());
			
			assertEquals(add.getAmountOfAlternatives().getName(), addViewModel.getAmountOfAlternatives());
			assertEquals(add.getAddClass().getName(), addViewModel.getAddClass());
			assertEquals(add.getCostsOfRevision().getName(), addViewModel.getCostsOfRevision());
			assertEquals(add.getPossibilityOfRevisability().getName(), addViewModel.getPossibilityOfRevisability());
			assertEquals(add.getProbabilityOfRevisability().getName(), addViewModel.getProbabilityOfRevisability());
		}

	}

	public void testPalladioElementTypeEqualsPalladioElementTypeViewModel(PalladioElementType palladioElementType,
			PalladioElementTypeViewModel palladioElementTypeViewModel) {
		if (palladioElementType == null || palladioElementTypeViewModel == null) {
			assertNull(palladioElementType);
			assertNull(palladioElementTypeViewModel);
		} else {
			assertNotNull(palladioElementType);
			assertNotNull(palladioElementTypeViewModel);

			testIdAndName(palladioElementType.getId(), palladioElementTypeViewModel.getId(),
					palladioElementType.getName(), palladioElementTypeViewModel.getName());

			assertEquals(palladioElementType.getType().getName(), palladioElementTypeViewModel.getType());
		}

	}

	public void testUncertaintyTypeEqualsUncertaintyTypeViewModel(UncertaintyType uncertaintyType,
			UncertaintyTypeViewModel uncertaintyTypeViewModel) {

		if (uncertaintyType == null || uncertaintyTypeViewModel == null) {
			assertNull(uncertaintyType);
			assertNull(uncertaintyTypeViewModel);
		} else {
			assertNotNull(uncertaintyType);
			assertNotNull(uncertaintyTypeViewModel);

			// Check basic fields
			testIdAndName(uncertaintyType.getId(), uncertaintyTypeViewModel.getId(), uncertaintyType.getName(),
					uncertaintyTypeViewModel.getName());

			// Check assignable element type
			testPalladioElementTypeEqualsPalladioElementTypeViewModel(uncertaintyType.getAssignableElementType(),
					uncertaintyTypeViewModel.getAssignableElementType());

			// Check impact on element types
			assertEquals(uncertaintyType.getImpactOn().size(), uncertaintyTypeViewModel.getImpactOn().size());
			for (int i = 0; i < uncertaintyType.getImpactOn().size(); i++) {
				testPalladioElementTypeEqualsPalladioElementTypeViewModel(uncertaintyType.getImpactOn().get(i),
						uncertaintyTypeViewModel.getImpactOn().get(i));
			}

			// Check resolved by add
			testADDEqualsADDViewModel(uncertaintyType.getResolvedBy(), uncertaintyTypeViewModel.getResolvedBy());

			// Check enums
			assertEquals(uncertaintyType.getImpactOnConfidentiality().getName(),
					uncertaintyTypeViewModel.getImpactOnConfidentiality());
			assertEquals(uncertaintyType.getInformationAvailability().getName(),
					uncertaintyTypeViewModel.getInformationAvailability());
			assertEquals(uncertaintyType.getLocation().getName(), uncertaintyTypeViewModel.getLocation());
			assertEquals(uncertaintyType.getManageability().getName(), uncertaintyTypeViewModel.getManageability());
			assertEquals(uncertaintyType.getNature().getName(), uncertaintyTypeViewModel.getNature());
			assertEquals(uncertaintyType.getResolutionTime().getName(), uncertaintyTypeViewModel.getResolutionTime());
			assertEquals(uncertaintyType.getRootCause().getName(), uncertaintyTypeViewModel.getRootCause());
			assertEquals(uncertaintyType.getSeverityOfImpact().getName(),
					uncertaintyTypeViewModel.getSeverityOfImpact());
		}

	}

	public void testUncertaintyEqualsUncertaintyViewModel(Uncertainty uncertainty,
			UncertaintyViewModel uncertaintyViewModel) {
		assertNotNull(uncertainty);
		assertNotNull(uncertaintyViewModel);

		testIdAndName(uncertainty.getId(), uncertaintyViewModel.getId(), uncertainty.getName(),
				uncertaintyViewModel.getName());

		testUncertaintyTypeEqualsUncertaintyTypeViewModel(uncertainty.getUncertaintyType(),
				uncertaintyViewModel.getUncertaintyTypeViewModel());

		testPalladioElementWrapperEqualsPalladioElementViewModel(uncertainty.getAssignedElement(),
				uncertaintyViewModel.getAssignedElement());

	}

	public void testPalladioElementWrapperEqualsPalladioElementViewModel(PalladioElementWrapper palladioElementWrapper,
			PalladioElementViewModel palladioElementViewModel) {
		if (palladioElementWrapper == null || palladioElementViewModel == null) {
			assertNull(palladioElementWrapper);
			assertNull(palladioElementViewModel);
		} else {
			assertNotNull(palladioElementWrapper);
			assertNotNull(palladioElementViewModel);

			Entity palladioElement = palladioElementWrapper.getReferencedElement();
			assertNotNull(palladioElement);

			testIdAndName(palladioElement.getId(), palladioElementViewModel.getId(),
					palladioElement.getEntityName(), palladioElementViewModel.getName());

		}

	}

	public void testUncertaintyEqualsUncertainty(Uncertainty uncertainty_1, Uncertainty uncertainty_2) {
		assertNotNull(uncertainty_1);
		assertNotNull(uncertainty_2);

		testIdAndName(uncertainty_1.getId(), uncertainty_2.getId(), uncertainty_1.getName(),
				uncertainty_2.getName());

		testUncertaintyTypeEqualsUncertaintyType(uncertainty_1.getUncertaintyType(),
				uncertainty_2.getUncertaintyType());

		testPalladioElementWrapperEqualsPalladioElement(uncertainty_1.getAssignedElement(),
				uncertainty_2.getAssignedElement());

	}

	private void testPalladioElementWrapperEqualsPalladioElement(PalladioElementWrapper assignedElement_1,
			PalladioElementWrapper assignedElement_2) {
		if (assignedElement_1 == null || assignedElement_2 == null) {
			assertNull(assignedElement_1);
			assertNull(assignedElement_2);
		} else {
			assertNotNull(assignedElement_1);
			assertNotNull(assignedElement_2);

			testIdAndName(assignedElement_1.getReferencedElement().getId(),
					assignedElement_2.getReferencedElement().getId(),
					assignedElement_1.getReferencedElement().getEntityName(),
					assignedElement_2.getReferencedElement().getEntityName());

		}

	}

	public void testUncertaintyTypeEqualsUncertaintyType(UncertaintyType uncertaintyType_1,
			UncertaintyType uncertaintyType_2) {
		if (uncertaintyType_1 == null || uncertaintyType_2 == null) {
			assertNull(uncertaintyType_1);
			assertNull(uncertaintyType_2);
		} else {
			assertNotNull(uncertaintyType_1);
			assertNotNull(uncertaintyType_2);

			// Check basic fields
			testIdAndName(uncertaintyType_1.getId(), uncertaintyType_2.getId(), uncertaintyType_1.getName(),
					uncertaintyType_2.getName());

			// Check assignable element type
			testPalladioElementTypeEqualsPalladioElementType(uncertaintyType_1.getAssignableElementType(),
					uncertaintyType_2.getAssignableElementType());

			// Check impact on element types
			assertEquals(uncertaintyType_1.getImpactOn().size(), uncertaintyType_2.getImpactOn().size());
			for (int i = 0; i < uncertaintyType_1.getImpactOn().size(); i++) {
				testPalladioElementTypeEqualsPalladioElementType(uncertaintyType_1.getImpactOn().get(i),
						uncertaintyType_2.getImpactOn().get(i));
			}

			// Check resolved by add
			testADDEqualsADD(uncertaintyType_1.getResolvedBy(), uncertaintyType_2.getResolvedBy());

			// Check enums
			assertEquals(uncertaintyType_1.getImpactOnConfidentiality(),
					uncertaintyType_2.getImpactOnConfidentiality());
			assertEquals(uncertaintyType_1.getInformationAvailability(),
					uncertaintyType_2.getInformationAvailability());
			assertEquals(uncertaintyType_1.getLocation(), uncertaintyType_2.getLocation());
			assertEquals(uncertaintyType_1.getManageability(), uncertaintyType_2.getManageability());
			assertEquals(uncertaintyType_1.getNature(), uncertaintyType_2.getNature());
			assertEquals(uncertaintyType_1.getResolutionTime(), uncertaintyType_2.getResolutionTime());
			assertEquals(uncertaintyType_1.getRootCause(), uncertaintyType_2.getRootCause());
			assertEquals(uncertaintyType_1.getSeverityOfImpact(), uncertaintyType_2.getSeverityOfImpact());
		}

	}

	private void testADDEqualsADD(ADD add_1, ADD add_2) {
		if (add_1 == null || add_2 == null) {
			assertNull(add_1);
			assertNull(add_2);
		} else {
			assertNotNull(add_1);
			assertNotNull(add_2);
			testIdAndName(add_1.getId(), add_2.getId(), add_1.getName(), add_2.getName());
			assertEquals(add_1.getAmountOfAlternatives(), add_2.getAmountOfAlternatives());
			assertEquals(add_1.getAddClass(), add_2.getAddClass());
			assertEquals(add_1.getCostsOfRevision(), add_2.getCostsOfRevision());
			assertEquals(add_1.getPossibilityOfRevisability(), add_2.getPossibilityOfRevisability());
			assertEquals(add_1.getProbabilityOfRevisability(), add_2.getProbabilityOfRevisability());
		}

	}

	private void testPalladioElementTypeEqualsPalladioElementType(PalladioElementType elementType_1,
			PalladioElementType elementType_2) {
		if (elementType_1 == null || elementType_2 == null) {
			assertNull(elementType_1);
			assertNull(elementType_2);
		} else {
			assertNotNull(elementType_1);
			assertNotNull(elementType_2);
			testIdAndName(elementType_1.getId(), elementType_2.getId(), elementType_1.getName(),
					elementType_2.getName());
			assertEquals(elementType_1.getType(), elementType_2.getType());
		}

	}

	public <T extends Entity> void testEntityEqualsEntity(T entity_1, Entity entity_2) {
		if (entity_1 == null || entity_2 == null) {
			assertNull(entity_1);
			assertNull(entity_2);
		} else {
			assertNotNull(entity_1);
			assertNotNull(entity_2);
			testIdAndName(entity_1.getId(), entity_2.getId(), entity_1.getEntityName(), entity_2.getEntityName());
		}

	}

	/*
	 * Helper method for bettererror message
	 */
	private void testIdAndName(String expected_id, String actual_id, String expected_name, String actual_name ) {
		
		
		String expected_id_and_name = expected_name + "(" + expected_id + ")";
		String actual_id_and_name = actual_name + "(" + actual_id + ")";

		assertEquals(expected_id_and_name, actual_id_and_name);
	}

}