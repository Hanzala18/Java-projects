import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class supplymanagement {
    public class supplymanagement {
        public static void main(String[] args) {
            Product p1 = new Product("food", 125);
        }

Employee e1 = new Employee("1", "Nobody" 17, 'M');
e1.placeOrder(p1, e1);
        Manager manager = new Manager("01", "name", 17,
                'F');manager.getOrderDetails();manager.setOrderPlaced(p1,true);manager.getOrderDetails();
    }

}

Product(String name, int price){
this.name = name; 
        this.price = price;
        class Product{ 
        String name;
        int price; 
        }
        }

    class Order {
        String order_date;
        Employee order_by;
        boolean placed_order;

        Order(String order_date, Employee order_by) {
            this.order_date = order_date;
            this.order_by = order_by;
            this.placed_order = false;
        }
    }

    class Person {
        String full_name;
        int age;
        char gender;

        Person(String full_name, int age, char gender) {
            this.full_name = full_name;
            this.age = age;
            this.gender = gender;
        }
    }

    class Employee extends Person {
        String id;

        Employee(String id, String full_name, int age, char gender) {
            super(full_name, age, gender);
            this.id = id;
        }

        public boolean placeOrder(Product product, Employee employee) {
            Order order = new Order(new SimpleDateFormat("dd/MM/yyy").format(new Date()), this);
            addOrder(product, order);
            return true;
        }

        private void addOrder(Product product, Order order) {
            Manager.order_list.put(product, order);
        }
    }

    class Manager extends Person {
        static HashMap<Product, Order> order_list = new HashMap<Product, Order>();
        String id;

        Manager(String id, String full_name, int age, char gender) {
            super(full_name, age, gender);
            this.id = id;
        }

    public void getOrderDetails() {
        for (Map.Entry<Product, Order> entry:
        order_list.entrySet()) {
            System.out.print("Order Details\n" + "\tName:" + entry.getKey().name + "\n"
        "Price:" + entry.getKey().price + "\n" +
        "tOrder request date:" + entry.getValue().order_date + "\n" +
        "Employee Detailın" +
        "\tEmployee ID:" + entry.getValue().order_by.id + "\n" +
        "\tEmployee name:" + entry.getValue().order_by.full_name + "\n" +
        "Is order placed:" + entry.getValue().placed_order + "\n\n");
}
    }

        public void setOrderPlaced(Product product, boolean placed_order) {
            order_list.get(product).placed_order = placed_order;
        }
}