package deathcap.junket;

/**
 * Replaced at build time with java.lang.Enum using relocation pattern
 *
 * Gets around 'Classes cannot directly extend java.lang.Enum', which is what enum types actually do
 */
public class PlaceholderEnum {

    protected PlaceholderEnum(String name, int index) {
        throw new AssertionError("deathcap.junket.Placeholder Enum invoked instead of java.lang.Enum!");

        // required for compilation type checker, even though it is never used
    }
}
