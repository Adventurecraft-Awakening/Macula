package net.mine_diver.macula.wrappers;

import java.nio.FloatBuffer;

public abstract class UniformLocation {

    protected final int location;

    public UniformLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return this.location;
    }

    public boolean isNull() {
        return this.location == -1;
    }

    public abstract void set1i(int x);

    public abstract void set1f(float x);

    public abstract void set3f(float x, float y, float z);

    public abstract void setMat4(boolean transpose, FloatBuffer matrix);
}
