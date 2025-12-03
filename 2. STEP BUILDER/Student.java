
//final - so that no other class can inherit or extend it
final class Student {

    private int id;
    private String name;
    private String city;

    //private - so that no one is able to create new object()
    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.city = builder.city;
    }

    public static class Builder {
        private int id;
        private String name;
        private String city;

        public static Builder builder() {
            return new Builder();
        }

        public Builder setId(int id)
        {
            this.id = id;
            return this;
        }

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setCity(String city)
        {
            this.city = city;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
    }
}
