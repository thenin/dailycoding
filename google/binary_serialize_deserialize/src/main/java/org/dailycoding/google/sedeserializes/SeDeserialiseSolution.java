package org.dailycoding.google.sedeserializes;

public class SeDeserialiseSolution {
    private String val;
    private SeDeserialiseSolution left;
    private SeDeserialiseSolution right;

    SeDeserialiseSolution(String val, SeDeserialiseSolution left, SeDeserialiseSolution right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    private SeDeserialiseSolution(){
        this.val="root";
        this.left = null;
        this.right = null;
    }

    static String doSrialise(SeDeserialiseSolution inClass){
        // TODO implement serialize
        return "";
    }

    static SeDeserialiseSolution doDeserialise(String inString){
        // TODO impement deserialize
        return new SeDeserialiseSolution();
    }

    @Override
    public boolean equals(Object o){
        // TODO see if this works
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (getClass() != o.getClass())
            return false;
        SeDeserialiseSolution other = (SeDeserialiseSolution) o;
        return val.equals(other.val) &&
                left.equals(other.left) &&
                right.equals(other.right);

    }

}
