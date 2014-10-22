public class SuperMarket {
    
    private PersonQueue queueOne = new SuperMarketQueue();
    
    public static void main(String[] args) {
        
        SuperMarket asda = new SuperMarket();
        asda.launch();
        
    }
    
    public void launch() {
        for (int i = 0; i < 5; i++) {
            Person person = new Person(i);
            this.addPerson(person);
            int n = queueOne.getQueueLength();
            System.out.println("The queue at ASDA is " + n +
                               " People long.");
        }
        this.servePerson();
        System.out.println("The queue at ASDA is " + (queueOne.getQueueLength_()) +
                               " People long.");
    }
    
    public void addPerson(Person person) {
        this.queueOne.insert(person);
    }
    
    public Person servePerson() {
        return this.queueOne.retrieve();
    }
    
    //public int getQueueLength() {
    //    return this.queueOne.getQueueLength_();
    //}

}