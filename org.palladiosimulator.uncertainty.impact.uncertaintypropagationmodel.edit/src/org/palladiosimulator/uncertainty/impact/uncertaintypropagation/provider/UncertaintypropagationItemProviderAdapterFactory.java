/**
 */
package org.palladiosimulator.uncertainty.impact.uncertaintypropagation.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.palladiosimulator.uncertainty.impact.uncertaintypropagation.util.UncertaintypropagationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UncertaintypropagationItemProviderAdapterFactory extends UncertaintypropagationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintypropagationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactRepositoryItemProvider ucImpactRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactRepositoryAdapter() {
		if (ucImpactRepositoryItemProvider == null) {
			ucImpactRepositoryItemProvider = new UCImpactRepositoryItemProvider(this);
		}

		return ucImpactRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCPropagationRulesSeedItemProvider ucPropagationRulesSeedItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCPropagationRulesSeed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCPropagationRulesSeedAdapter() {
		if (ucPropagationRulesSeedItemProvider == null) {
			ucPropagationRulesSeedItemProvider = new UCPropagationRulesSeedItemProvider(this);
		}

		return ucPropagationRulesSeedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CausingUncertaintyItemProvider causingUncertaintyItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.CausingUncertainty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCausingUncertaintyAdapter() {
		if (causingUncertaintyItemProvider == null) {
			causingUncertaintyItemProvider = new CausingUncertaintyItemProvider(this);
		}

		return causingUncertaintyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyPropagationItemProvider uncertaintyPropagationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UncertaintyPropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUncertaintyPropagationAdapter() {
		if (uncertaintyPropagationItemProvider == null) {
			uncertaintyPropagationItemProvider = new UncertaintyPropagationItemProvider(this);
		}

		return uncertaintyPropagationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtBasicComponentBehaviourItemProvider ucImpactAtBasicComponentBehaviourItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtBasicComponentBehaviourAdapter() {
		if (ucImpactAtBasicComponentBehaviourItemProvider == null) {
			ucImpactAtBasicComponentBehaviourItemProvider = new UCImpactAtBasicComponentBehaviourItemProvider(this);
		}

		return ucImpactAtBasicComponentBehaviourItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtBasicComponentTypeItemProvider ucImpactAtBasicComponentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtBasicComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtBasicComponentTypeAdapter() {
		if (ucImpactAtBasicComponentTypeItemProvider == null) {
			ucImpactAtBasicComponentTypeItemProvider = new UCImpactAtBasicComponentTypeItemProvider(this);
		}

		return ucImpactAtBasicComponentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtCommunicationComponentsItemProvider ucImpactAtCommunicationComponentsItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationComponents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtCommunicationComponentsAdapter() {
		if (ucImpactAtCommunicationComponentsItemProvider == null) {
			ucImpactAtCommunicationComponentsItemProvider = new UCImpactAtCommunicationComponentsItemProvider(this);
		}

		return ucImpactAtCommunicationComponentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtCommunicationResourcesItemProvider ucImpactAtCommunicationResourcesItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtCommunicationResources}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtCommunicationResourcesAdapter() {
		if (ucImpactAtCommunicationResourcesItemProvider == null) {
			ucImpactAtCommunicationResourcesItemProvider = new UCImpactAtCommunicationResourcesItemProvider(this);
		}

		return ucImpactAtCommunicationResourcesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtComponentInstanceItemProvider ucImpactAtComponentInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtComponentInstanceAdapter() {
		if (ucImpactAtComponentInstanceItemProvider == null) {
			ucImpactAtComponentInstanceItemProvider = new UCImpactAtComponentInstanceItemProvider(this);
		}

		return ucImpactAtComponentInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtComponentInterfaceInstanceItemProvider ucImpactAtComponentInterfaceInstanceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtComponentInterfaceInstanceAdapter() {
		if (ucImpactAtComponentInterfaceInstanceItemProvider == null) {
			ucImpactAtComponentInterfaceInstanceItemProvider = new UCImpactAtComponentInterfaceInstanceItemProvider(this);
		}

		return ucImpactAtComponentInterfaceInstanceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtComponentInterfaceTypeItemProvider ucImpactAtComponentInterfaceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtComponentInterfaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtComponentInterfaceTypeAdapter() {
		if (ucImpactAtComponentInterfaceTypeItemProvider == null) {
			ucImpactAtComponentInterfaceTypeItemProvider = new UCImpactAtComponentInterfaceTypeItemProvider(this);
		}

		return ucImpactAtComponentInterfaceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtHardwareResourceItemProvider ucImpactAtHardwareResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtHardwareResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtHardwareResourceAdapter() {
		if (ucImpactAtHardwareResourceItemProvider == null) {
			ucImpactAtHardwareResourceItemProvider = new UCImpactAtHardwareResourceItemProvider(this);
		}

		return ucImpactAtHardwareResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtSystemItemProvider ucImpactAtSystemItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtSystemAdapter() {
		if (ucImpactAtSystemItemProvider == null) {
			ucImpactAtSystemItemProvider = new UCImpactAtSystemItemProvider(this);
		}

		return ucImpactAtSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtSystemInterfaceItemProvider ucImpactAtSystemInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtSystemInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtSystemInterfaceAdapter() {
		if (ucImpactAtSystemInterfaceItemProvider == null) {
			ucImpactAtSystemInterfaceItemProvider = new UCImpactAtSystemInterfaceItemProvider(this);
		}

		return ucImpactAtSystemInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UCImpactAtUsageBehaviourItemProvider ucImpactAtUsageBehaviourItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.UCImpactAtUsageBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUCImpactAtUsageBehaviourAdapter() {
		if (ucImpactAtUsageBehaviourItemProvider == null) {
			ucImpactAtUsageBehaviourItemProvider = new UCImpactAtUsageBehaviourItemProvider(this);
		}

		return ucImpactAtUsageBehaviourItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceInstanceContainerItemProvider componentInterfaceInstanceContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.ComponentInterfaceInstanceContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInterfaceInstanceContainerAdapter() {
		if (componentInterfaceInstanceContainerItemProvider == null) {
			componentInterfaceInstanceContainerItemProvider = new ComponentInterfaceInstanceContainerItemProvider(this);
		}

		return componentInterfaceInstanceContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicComponentBehaviourContainerItemProvider basicComponentBehaviourContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.uncertainty.impact.uncertaintypropagation.BasicComponentBehaviourContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasicComponentBehaviourContainerAdapter() {
		if (basicComponentBehaviourContainerItemProvider == null) {
			basicComponentBehaviourContainerItemProvider = new BasicComponentBehaviourContainerItemProvider(this);
		}

		return basicComponentBehaviourContainerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (ucImpactRepositoryItemProvider != null) ucImpactRepositoryItemProvider.dispose();
		if (ucPropagationRulesSeedItemProvider != null) ucPropagationRulesSeedItemProvider.dispose();
		if (causingUncertaintyItemProvider != null) causingUncertaintyItemProvider.dispose();
		if (uncertaintyPropagationItemProvider != null) uncertaintyPropagationItemProvider.dispose();
		if (ucImpactAtBasicComponentBehaviourItemProvider != null) ucImpactAtBasicComponentBehaviourItemProvider.dispose();
		if (ucImpactAtBasicComponentTypeItemProvider != null) ucImpactAtBasicComponentTypeItemProvider.dispose();
		if (ucImpactAtCommunicationComponentsItemProvider != null) ucImpactAtCommunicationComponentsItemProvider.dispose();
		if (ucImpactAtCommunicationResourcesItemProvider != null) ucImpactAtCommunicationResourcesItemProvider.dispose();
		if (ucImpactAtComponentInstanceItemProvider != null) ucImpactAtComponentInstanceItemProvider.dispose();
		if (ucImpactAtComponentInterfaceInstanceItemProvider != null) ucImpactAtComponentInterfaceInstanceItemProvider.dispose();
		if (ucImpactAtComponentInterfaceTypeItemProvider != null) ucImpactAtComponentInterfaceTypeItemProvider.dispose();
		if (ucImpactAtHardwareResourceItemProvider != null) ucImpactAtHardwareResourceItemProvider.dispose();
		if (ucImpactAtSystemItemProvider != null) ucImpactAtSystemItemProvider.dispose();
		if (ucImpactAtSystemInterfaceItemProvider != null) ucImpactAtSystemInterfaceItemProvider.dispose();
		if (ucImpactAtUsageBehaviourItemProvider != null) ucImpactAtUsageBehaviourItemProvider.dispose();
		if (componentInterfaceInstanceContainerItemProvider != null) componentInterfaceInstanceContainerItemProvider.dispose();
		if (basicComponentBehaviourContainerItemProvider != null) basicComponentBehaviourContainerItemProvider.dispose();
	}

}