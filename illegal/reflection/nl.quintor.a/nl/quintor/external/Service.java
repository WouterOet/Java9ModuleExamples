package nl.quintor.external;

import nl.quintor.internal.Internal;

public class Service {

    public static Object getInstance() {
        return new Internal();
    }
}
