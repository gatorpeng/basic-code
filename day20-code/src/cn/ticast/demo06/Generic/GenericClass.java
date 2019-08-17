package cn.ticast.demo06.Generic;

public class GenericClass<E> {
    private E name;

    public GenericClass() {
    }

    public GenericClass(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}


