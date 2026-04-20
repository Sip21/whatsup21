package com.funwithjava.oops;

public class SchoolParentClass {

    public String principal(){
        return "Principal Needed";
    }

    public String teacher(){
        return "Teachers Needed";
    }

    public String children(){
        return "Children Needed";
    }

    public String schoolName(){
        throw new UnsupportedOperationException("Exception");
    }
}
