package pl.edu.pjatk.tau;

import lombok.Data;

public class Rack {

    public final int size;

    public Rack() {
        this(42);
    }

    private Rack(int size) {
        this.size = size;
    }

}
