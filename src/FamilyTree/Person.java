package FamilyTree;
import java.util.List;

public class Person {
        String name;
        String middleName;
        String lastName;
        String sex;
        String age;
        String mother;
        String father;


        List<String> siblings;
        List<String> children;
        List<String> pets; //Took a while to remember how to instance a List








        public Person(String name, String lastName, String sex, String age) {
                this.name = name;
                this.lastName = lastName;
                this.sex = sex;
                this.age = age;
        }

        public Person(String name, String middleName, String lastName, String sex, String age) {
                this.name = name;
                this.middleName = middleName;
                this.lastName = lastName;
                this.sex = sex;
                this.age = age;
        }





        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getMiddleName() {
                return middleName;
        }

        public void setMiddleName(String middleName) {
                this.middleName = middleName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getSex() {
                return sex;
        }

        public void setSex(String sex) {
                this.sex = sex;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {
                this.age = age;
        }

        public String getMother() {
                return mother;
        }

        public void setMother(String mother) {
                this.mother = mother;
        }

        public String getFather() {
                return father;
        }

        public void setFather(String father) {
                this.father = father;
        }

        public List<String> getSiblings() {
                return siblings;
        }

        public void setSiblings(List<String> siblings) {
                this.siblings = siblings;
        }

        public List<String> getChildren() {
                return children;
        }

        public void setChildren(List<String> children) {
                this.children = children;
        }

        public List<String> getPets() {
                return pets;
        }

        public void setPets(List<String> pets) {
                this.pets = pets;
        }









}


//Start with required classes
//Finished required classes

//Implement attributes