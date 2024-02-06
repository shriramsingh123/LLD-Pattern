package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final int roll;
    private final List<Language> languages;

    public Student(Builder builder) {
        this.name= builder.name;
        this.roll= builder.roll;
        this.languages = builder.languages;
    }

    public static class Builder {

        private int roll;
        private String name;
        private final List<Language> languages = new ArrayList<>();

        public int getRoll() {
            return roll;
        }

        public Builder setRoll(int roll) {
            this.roll = roll;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public List<Language> getLanguages() {
            return languages;
        }

        public Builder setLanguages(Language language) {
            this.languages.add(language);
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", languages=" + languages +
                '}';
    }


}
