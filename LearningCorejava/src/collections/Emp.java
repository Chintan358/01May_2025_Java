package collections;

public class Emp implements Comparable<Emp> {

    int id;
    String name;
    String email;

    public Emp(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //10 2 3
    @Override
    public int compareTo(Emp o) {
//        int i = 0;
//        if(o.id>this.id)
//        {
//            i = -1;
//        }
//        else if(o.id<this.id)
//        {
//            i=+1;
//        }
//        else {
//            i=0;
//        }
//
//        return i;

        return -o.name.compareTo(this.name);
    }
}
