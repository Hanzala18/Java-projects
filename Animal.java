interface Animal {

    public void eat();

    public void travel();

    public class Reptiles implements Animal {

        @Override
        public void eat() {

            System.out.println("Reptiles eat insects");
        }

        @Override
        public void travel() {

            System.out.println("Reptiles walk on land and water");
        }
    }

    public class bird implements Animal {

        @Override
        public void eat() {

            System.out.println("Birds eat land animal and water animal");
        }

        @Override
        public void travel() {

            System.out.println("Birds travel in air");
        }
    }

    public class fishs implements Animal {

        @Override
        public void eat() {

            System.out.println("Fishes eat water animals ");
        }

        @Override
        public void travel() {

            System.out.println("Fishes travels in water only");
        }
    }

    public static void main(String args[]) {

        Animal repobj = new Reptiles();

        Animal birdobj = new bird();

        Animal fishobj = new fishs();

        repobj.eat();
        repobj.travel();
        birdobj.eat();
        birdobj.travel();
        fishobj.eat();
        fishobj.travel();

    }
}