public class Dog {
        public String dogName;
        public String ownerName;

        public Dog(String newDogName, String newOwnerName) {
            dogName = newDogName;
            ownerName = newOwnerName;
        }

        public void setDogName(String newDogName) {
            this.dogName = newDogName;
        }

        public void setOwnerName(String newOwnerName) {
            this.ownerName = newOwnerName;
        }

        public void output() {
            System.out.println(this.dogName + "'s owner is " + this.ownerName);
        }
}
