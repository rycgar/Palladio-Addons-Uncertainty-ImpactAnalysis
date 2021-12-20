package org.palladiosimulator.uncertainty.impact.propagation.util;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.uncertainty.impact.uncertaintymodel.palladioelementtype.PalladioElementTypes;

public class UncertaintyPropagationTypeToRuleResolver {

	private UncertaintyPropagationTypeToRuleResolver() {

	}

	private static final Map<String, PropagationRuleType> fromElementTypeToElementTypeResolverMap;
	static {
		fromElementTypeToElementTypeResolverMap = new HashMap<>();

		// Code generated with code snippet below :-)
		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_SYSTEM", PropagationRuleType.FROM_SYSTEM_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_SYSTEM_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_SYSTEM_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_SYSTEM_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_SYSTEM_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_SYSTEM_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_SYSTEM_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_SYSTEM_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_SYSTEM_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_SYSTEM_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_SYSTEM_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_SYSTEM",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("HARDWARE_RESOURCE_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_HARDWARE_RESOURCE_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_SYSTEM",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_TYPE_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_BASIC_COMPONENT_TYPE_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_SYSTEM",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INSTANCE_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_COMPONENT_INSTANCE_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_SYSTEM",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("BASIC_COMPONENT_BEHAVIOUR_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_BASIC_COMPONENT_BEHAVIOUR_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_SYSTEM",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_COMPONENTS_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_COMMUNICATION_COMPONENTS_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_SYSTEM",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMMUNICATION_RESOURCES_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_COMMUNICATION_RESOURCES_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_SYSTEM",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("SYSTEM_INTERFACE_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_SYSTEM_INTERFACE_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_SYSTEM",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_INSTANCE_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_INSTANCE_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_SYSTEM",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("COMPONENT_INTERFACE_TYPE_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_COMPONENT_INTERFACE_TYPE_TO_USAGE_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_SYSTEM",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_SYSTEM);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_HARDWARE_RESOURCE",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_HARDWARE_RESOURCE);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_BASIC_COMPONENT_TYPE",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_BASIC_COMPONENT_TYPE);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_COMPONENT_INSTANCE",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_COMPONENT_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_BASIC_COMPONENT_BEHAVIOUR",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_BASIC_COMPONENT_BEHAVIOUR);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_COMMUNICATION_COMPONENTS",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_COMMUNICATION_COMPONENTS);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_COMMUNICATION_RESOURCES",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_COMMUNICATION_RESOURCES);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_SYSTEM_INTERFACE",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_SYSTEM_INTERFACE);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_COMPONENT_INTERFACE_INSTANCE",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_COMPONENT_INTERFACE_INSTANCE);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_COMPONENT_INTERFACE_TYPE",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_COMPONENT_INTERFACE_TYPE);

		fromElementTypeToElementTypeResolverMap.put("USAGE_BEHAVIOUR_TO_USAGE_BEHAVIOUR",
				PropagationRuleType.FROM_USAGE_BEHAVIOUR_TO_USAGE_BEHAVIOUR);

	}

	/**
	 * Given starting and ending element, this methods resolves to the correct
	 * {@link PropagationRuleType}
	 * 
	 * @param from
	 * @param to
	 * @return
	 */
	public static PropagationRuleType resolve(PalladioElementTypes from, PalladioElementTypes to) {
		String key = from + "_TO_" + to;
		return fromElementTypeToElementTypeResolverMap.get(key);
	}

	// Generator code -> use if more elements arise
//	public static void main(String[] args) {
//
//		PalladioElementTypes[] possibleValues = BASIC_COMPONENT_TYPE.getDeclaringClass().getEnumConstants();
//		System.out.println("Start \n");
//		for (PalladioElementTypes outer : possibleValues) {
//
//			for (PalladioElementTypes inner : possibleValues) {
//				StringBuilder sb = new StringBuilder();
//
//				sb.append("fromElementTypeToElementTypeResolverMap.put(\"");
//				sb.append(outer.getLiteral());
//				sb.append("_TO_");
//				sb.append(inner.getLiteral());
//				sb.append("\", PropagationRuleTypes.");
//
//				sb.append("FROM_");
//				sb.append(outer.getLiteral());
//				sb.append("_TO_");
//				sb.append(inner.getLiteral());
//				sb.append(");\n");
//				System.out.println(sb.toString());
//			}
//
//		}
//
//	}

}
