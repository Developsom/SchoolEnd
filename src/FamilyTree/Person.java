package FamilyTree;
import java.util.List;

public class Person {
        private String name;
        private String middleName;
        private String lastName;
        private String sex;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> siblings;
        private List<Person> children;
        private List<Pet> pets;

        public Person(String name, String middleName, String lastName, String sex, int age) {
                this.name = name;
                this.middleName = middleName;
                this.lastName = lastName;
                this.sex = sex;
                this.age = age;
        }

        public Person(String name, String lastName, String sex, int age) {
                this.name = name;
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

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public Person getMother() {
                return mother;
        }

        public void setMother(Person mother) {
                this.mother = mother;
        }

        public Person getFather() {
                return father;
        }

        public void setFather(Person father) {
                this.father = father;
        }

        public List<Person> getSiblings() {
                return siblings;
        }

        public void setSiblings(List<Person> siblings) {
                this.siblings = siblings;
        }

        public List<Person> getChildren() {
                return children;
        }

        public void setChildren(List<Person> children) {
                this.children = children;
        }

        public List<Pet> getPets() {
                return pets;
        }

        public void setPets(List<Pet> pets) {
                this.pets = pets;
        }

        public void addParents(Person father, Person mother) {
                this.father = father;
                this.mother = mother;
        }


        // Take your time and continue from here
        //addParents methode
        //addChild methode
        //addPet methode
        //addSibling methode
        //getGrandChildren methode
        //Schrijf de benodigde methodes in de juiste klassen.
        //
        //Tip voor addParents: Parents zijn twee Persons
        //
        //Tip voor addChild, addPet en addSibling: Voeg toe aan de lijst.
        //
        //Tip voor getGrandChildren: Dit is een uitdagende methode. Grandchildren zijn de children van de children van een persoon. Gebruik loops.


}