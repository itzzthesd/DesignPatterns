package BuilderDP;

public class Student {
    String name;
    int age;
    String address;
    String univName;

    public Student(Builder h) throws IllegalAccessException {
        if (h.age < 20) {
            throw new IllegalAccessException("age cant be less than 20");
        }
        this.name = h.name;
        this.age = h.age;
        this.address = h.address;
        this.univName = h.univName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;
        private String address;
        private String univName;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getAddress() {
            return address;

        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }
        public Student build() throws IllegalAccessException {
            return new Student(this);
        }

    }
}
