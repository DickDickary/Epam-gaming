package ProgrammingWithClasses.AggregationAndComposition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Customers {
    ArrayList<Customer> customers = new ArrayList<>();

    Customer customer = new Customer(1,"Дед","Барадед","Петрович",6,7);
    Customer customer1 = new Customer(1,"Бабка","Дерябка","Петровна",6,3);
    Customer customer2 = new Customer(1,"Сын","Хун","Мин",6,8);


    public void sortName(){
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        Collections.sort(customers, new Comparator<Customer>() {
                    @Override
                    public int compare(Customer o1, Customer o2) {
                        return o1.getFirstName().compareTo(o2.getFirstName());
                    }
                }

        );
        System.out.println(customers.toString());
    }
    public void interval(int a,int b){
        for (int i = 0; i < customers.size(); i ++){

        if (a <= customers.get(i).getNumBank() && b >= customers.get(i).getNumBank()){
            System.out.println(customers.get(i).toString());

                }
            }
        }

    }


