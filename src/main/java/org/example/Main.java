package org.example;

import org.example.src.BeiWangLuMoShi.CareTaker;
import org.example.src.BeiWangLuMoShi.Originator;
import org.example.src.CeLueMoShi.AddStrategy;
import org.example.src.CeLueMoShi.Environment;
import org.example.src.CeLueMoShi.SubstractStrategy;
import org.example.src.ChouXiangGongChangMoShi.*;
import org.example.src.ChuanShuDuiXiangMoShi.StudentBO;
import org.example.src.ChuanShuDuiXiangMoShi.StudentVO;
import org.example.src.DaiLiMoShi.*;
import org.example.src.DanLiMoShi.LazySingleton;
import org.example.src.DanLiMoShi.PreloadSingleton;
import org.example.src.DieDaiQiMoShi.Iterator;
import org.example.src.DieDaiQiMoShi.NameRepository;
import org.example.src.FangWenZheMoShi.Computer1;
import org.example.src.FangWenZheMoShi.ComputerPart;
import org.example.src.FangWenZheMoShi.ComputerPartDisplayVisitor;
import org.example.src.FuWuDingWeiQiMoShi.Service;
import org.example.src.FuWuDingWeiQiMoShi.ServiceLocator;
import org.example.src.GongChangMoShi.*;
import org.example.src.GuanChaZheMoShi.Observer;
import org.example.src.GuanChaZheMoShi.User;
import org.example.src.GuanChaZheMoShi.WechatServer;
import org.example.src.GuoLvQiMoShi.*;
import org.example.src.JianZaoZheMoShi.Bike;
import org.example.src.JianZaoZheMoShi.Director;
import org.example.src.JianZaoZheMoShi.MobileBuilder;
import org.example.src.JianZaoZheMoShi.OfoBuilder;
import org.example.src.JieShiQiMoShi.AndExpression;
import org.example.src.JieShiQiMoShi.Expression;
import org.example.src.JieShiQiMoShi.OrExpression;
import org.example.src.JieShiQiMoShi.TerminalExpression;
import org.example.src.KongDuiXiangMoShi.AbstractCustomer;
import org.example.src.KongDuiXiangMoShi.CustomerFactory;
import org.example.src.LanJieGuoLvQiMoShi.*;
import org.example.src.MVCMoShi.StudentController;
import org.example.src.MVCMoShi.StudentModel;
import org.example.src.MVCMoShi.StudentView;
import org.example.src.MingLingMoShi.Broker;
import org.example.src.MingLingMoShi.BuyStock;
import org.example.src.MingLingMoShi.SellStock;
import org.example.src.MingLingMoShi.Stock;
import org.example.src.MuBanMoShi.Bouilli;
import org.example.src.MuBanMoShi.Dish;
import org.example.src.MuBanMoShi.EggsWithTomato;
import org.example.src.QianDuanKongZhiQiMoShi.FrontController;
import org.example.src.QiaoJieMoShi.Guitar;
import org.example.src.QiaoJieMoShi.Leilei;
import org.example.src.QiaoJieMoShi.Mouth;
import org.example.src.ShiPeiQiMoShi.Adapter;
import org.example.src.ShiPeiQiMoShi.NewPhone;
import org.example.src.ShuJuFangWenDuiXiangMoShi.StudentA;
import org.example.src.ShuJuFangWenDuiXiangMoShi.StudentDao;
import org.example.src.ShuJuFangWenDuiXiangMoShi.StudentDaoImpl;
import org.example.src.WaiGuanMoShi.Computer;
import org.example.src.XiangYuanMoShi.FlyweightFactory;
import org.example.src.XiangYuanMoShi.IFlyweight;
import org.example.src.YeWuDaiBiaoMoShi.BusinessDelegate;
import org.example.src.YeWuDaiBiaoMoShi.Client1;
import org.example.src.YuanXingMoShi.Resume;
import org.example.src.ZeRenLianMoShi.AbstractLogger;
import org.example.src.ZeRenLianMoShi.ConsoleLogger;
import org.example.src.ZeRenLianMoShi.ErrorLogger;
import org.example.src.ZeRenLianMoShi.FileLogger;
import org.example.src.ZhongJieZheMoShi.User1;
import org.example.src.ZhuangShiQiMoShi.Component;
import org.example.src.ZhuangShiQiMoShi.ConcreteComponent;
import org.example.src.ZhuangShiQiMoShi.ConcreteDecorator;
import org.example.src.ZhuangShiQiMoShi.Decorator;
import org.example.src.ZhuangTaiMoShi.Context;
import org.example.src.ZhuangTaiMoShi.StartState;
import org.example.src.ZhuangTaiMoShi.StopState;
import org.example.src.ZuHeMoShi.Menu;
import org.example.src.ZuHeMoShi.MenuComponent;
import org.example.src.ZuHeMoShi.MenuItem;
import org.example.src.ZuHeShiTiMoShi.Client2;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        //单例模式：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
        PreloadSingleton.getInstance().print();
        LazySingleton.getInstance().print();

        //简单工厂模式
        FruitFactorySimple fruitFactorySimple = new FruitFactorySimple();
        Fruit apple = fruitFactorySimple.produce("apple");
        apple.print();
        Fruit orange = fruitFactorySimple.produce("orange");
        orange.print();

        //工厂模式
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple1 = appleFactory.produceFruit();
        apple1.print();
        FruitFactory orangeFactory = new OrangeFactory();
        Fruit orange1 = orangeFactory.produceFruit();
        orange1.print();

        //抽象工厂模式
        AbstractFactory xiaomiFactory = new XiaomiFactory();
        Pad xiaomiPad = xiaomiFactory.producePad();
        xiaomiPad.produce();
        Phone xiaomiPhone = xiaomiFactory.producePhone();
        xiaomiPhone.produce();
        AbstractFactory huaweiFactory = new HuaweiFactory();
        Pad HuaweiPad = huaweiFactory.producePad();
        HuaweiPad.produce();
        Phone XiaomiPhone = huaweiFactory.producePhone();
        XiaomiPhone.produce();

        //建造者模式
        //创建指挥者对象
        Director director = new Director(new MobileBuilder());
        //让指挥者组装自行车
        Bike mobileBike = director.construct();
        System.out.println(mobileBike.getFrame());
        System.out.println(mobileBike.getSeat());
        director = new Director(new OfoBuilder());
        Bike ofoBike = director.construct();
        System.out.println(ofoBike.getFrame());
        System.out.println(ofoBike.getSeat());

        //原型模式, 不需要new，直接从内存中clone，节省时间和资源，适合需要生成大量的实例
        Resume a = new Resume("大鸟");       //实例化简历类，调用Resume类有参的构造方法
        a.SetPersonalInfo("男", "29");       //调用SetPersonalInfo方法，并传值
        a.SetWorkExperience("1998-2000", "xx公司"); //调用SetWorkExperience方法，并传值

        //调用Clone方法，实现新简历的生成，并且可以再修改新简历的细节
        Resume b = a.clone();         //克隆a对象，并赋值给简历对象b，此时a和b一样
        b.SetWorkExperience("1998-2006", "yy公司");       //b对象可以修改自己简历的细节

        Resume c = a.clone();          //克隆a对象给简历对象c
        c.SetPersonalInfo("男", "24");         //c对象可以修改自己简历的细节

        a.Display();       //显示简历a
        b.Display();       //显示简历a
        c.Display();       //显示简历a

        //适配器模式
        NewPhone newPhone = new NewPhone();
        newPhone.charging(new Adapter());

        //装饰器模式
        //创建需要被装饰的组件
        Component component = new ConcreteComponent();
        //给对象透明的增加功能并调用
        Decorator decorator = new ConcreteDecorator(component);
        decorator.execute();


        //代理模式
        //静态代理
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(new BuyHouseImpl());
        buyHouseProxy.buyHosue();

        //动态代理
        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse proxyBuyHouse = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader()
                , new Class[]{BuyHouse.class}
                , new DynamicProxyHandler(buyHouse));
        proxyBuyHouse.buyHosue();

        //CGLIB代理
        APlayer aplayer = new APlayer();
        APlayer proxy = new CglibProxyFactory().getProxy(aplayer.getClass());
        //验证代理类的父类
        System.out.println("代理类的父类：" + proxy.getClass().getSuperclass().getSimpleName());
        proxy.loadAudio("荷塘月色.mp3");
        proxy.playAudio("荷塘月色.mp3");


        //外观模式
        Computer computer = new Computer();
        computer.start();
        computer.shutDown();

        //桥接模式
        Leilei mouth = new Leilei(new Mouth());
        mouth.perform();

        Leilei guitar = new Leilei(new Guitar());
        guitar.perform();

        //组合模式
        //创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        //创建一级菜单
        MenuComponent componentM = new Menu("系统管理", 1);
        //将二级菜单添加到一级菜单中
        componentM.add(menu1);
        componentM.add(menu2);
        componentM.add(menu3);

        componentM.print();

        //享元模式
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IFlyweight flyweight1 = flyweightFactory.getFlyweight("A");
        IFlyweight flyweight2 = flyweightFactory.getFlyweight("B");
        IFlyweight flyweight3 = flyweightFactory.getFlyweight("A");
        flyweight1.print();
        flyweight2.print();
        flyweight3.print();
        System.out.println(flyweightFactory.getFlyweightMapSize());

        //策略模式
        Environment environment = new Environment(new AddStrategy());
        int result = environment.calculate(20, 5);
        System.out.println(result);

        Environment environment1 = new Environment(new SubstractStrategy());
        int result1 = environment1.calculate(20, 5);
        System.out.println(result1);

        //模板模式
        Dish eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dodish();
        System.out.println("-----------------------------");
        Dish bouilli = new Bouilli();
        bouilli.dodish();

        //观察者模式
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("JAVA是世界上最好用的语言！");


        //迭代器模式
        NameRepository namesRepository = new NameRepository();
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }

        //责任链模式
        AbstractLogger loggerChain = getChainOfLoggers();
        //只能打印Info的日志
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        //打印Info和Debug的日志
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");
        //打印所有日志，链式传导
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");


        //命令模式
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();

        //状态模式
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());


        //备忘录模式
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());


        //访问者模式
        ComputerPart computer1 = new Computer1();
        computer1.accept(new ComputerPartDisplayVisitor());

        //中介者模式
        User1 robert = new User1("Robert");
        User1 john = new User1("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");

        //解释器模式
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));

        //过滤器模式，标准模式
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));


        //空对象模式
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());


        //MVC模式
        //从数据库获取学生记录
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
        //更新模型数据
        controller.setStudentName("John");
        controller.updateView();


        //业务代理模式
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client1 client = new Client1(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();


        //组合实体模式
        Client2 client2 = new Client2();
        client2.setData("Test", "Data");
        client2.printData();
        client2.setData("Second Test", "Data1");
        client2.printData();


        //DAO模式 数据访问对象模式
        StudentDao studentDao = new StudentDaoImpl();
        //输出所有的学生
        for (StudentA studenta : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + studenta.getRollNo() + ", Name : " + studenta.getName() + " ]");
        }
        //更新学生
        StudentA studenta = studentDao.getAllStudents().get(0);
        studenta.setName("Michael");
        studentDao.updateStudent(studenta);
        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                + studenta.getRollNo() + ", Name : " + studenta.getName() + " ]");

        //前端控制器模式
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");


        //拦截过滤器模式
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());
        Client client1 = new Client();
        client1.setFilterManager(filterManager);
        client1.sendRequest("HOME");

        //服务定位器模式
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();


        //传输对象模式
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO studentv : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + studentv.getRollNo() + ", Name : " + studentv.getName() + " ]");
        }

        //更新学生
        StudentVO studentv = studentBusinessObject.getAllStudents().get(0);
        studentv.setName("Michael");
        studentBusinessObject.updateStudent(studentv);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                + studentv.getRollNo() + ", Name : " + studentv.getName() + " ]");
    }

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}