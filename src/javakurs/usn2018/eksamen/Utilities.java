package javakurs.usn2018.eksamen;

public abstract class Utilities {
	public static <T extends Comparable<T>> T setVariableWithinRange(String variableName, T value, T minValue, T maxValue) {
		if (value.compareTo(minValue) < 0 || value.compareTo(maxValue) > 0)
		{
			throw new IllegalArgumentException(variableName + " must be between " + minValue + " and " + maxValue);
		}
		return value;
	}
}
