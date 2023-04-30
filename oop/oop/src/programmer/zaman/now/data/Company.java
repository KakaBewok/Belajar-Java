package programmer.zaman.now.data;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        private String name;

        //method untuk mengakses field outer class
        public String getCompany(){
            return Company.this.getName();
            //bisa juga langsung akses fieldnya
            //karena inner class bisa akses field outer class
            //yang diprivate
//            return Company.this.name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
//di java kita bisa juga membuat class di dalam class
//atau inner class