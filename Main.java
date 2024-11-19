import java.util.ArrayList;

// HealthProfessional类（基类），对应作业Part 1要求。此部分要求创建一个健康专业人员的基类，该基类应包含以下内容：
// 1. 必需的实例变量：ID（仅数字）和名称，这里的ID用于唯一标识健康专业人员，name表示其姓名。
// 2. 另一个实例变量，用于描述与医生类型无关的基本信息，此处用department表示工作部门等信息。
// 3. 一个默认构造函数，用于在创建对象时若未传入参数则使用默认设置初始化对象。
// 4. 第二个构造函数，用于初始化所有实例变量，通过传入的参数来设置健康专业人员的ID、姓名和部门信息。
// 5. 一个打印所有实例变量的方法，用于输出健康专业人员的ID、姓名和部门信息。
class HealthProfessional {
    private int ID;
    private String name;
    private String department;

    // 默认构造函数，满足Part 1中创建默认构造函数的要求
    public HealthProfessional() {
    }

    // 初始化所有实例变量的构造函数，满足Part 1中创建初始化所有实例变量构造函数的要求
    public HealthProfessional(int ID, String name, String department) {
        this.ID = ID;
        this.name = name;
        this.department = department;
    }

    // 打印所有实例变量的方法，用于输出健康专业人员的ID、姓名和部门信息。
    public void printAllVariables() {
        System.out.println("编号: " + ID);
        System.out.println("姓名: " + name);
        System.out.println("部门: " + department);
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作这些属性。虽然作业未明确提及，但这有助于遵循面向对象编程的封装原则，使得类的内部数据可以被安全地访问和修改。
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// GeneralPractitioner类（子类），对应作业Part 2要求。该部分要求创建代表全科医生的子类，继承自HealthProfessional基类，子类需具备以下内容：
// 1. 至少另一个相关且适合区分全科医生和其他健康专业人员类型的实例变量，这里用isGoodAtFamilyMedicine表示是否擅长家庭医疗。
// 2. 一个默认构造函数，用于在创建全科医生对象时若未传入参数则使用默认设置初始化对象。
// 3. 第二个构造函数，用于初始化所有实例变量（包括基类实例变量），通过传入的参数初始化全科医生的ID、姓名、部门以及是否擅长家庭医疗等信息，其中通过super调用基类构造函数初始化基类的实例变量。
// 4. 一个打印健康专业人员详细信息的方法，包括健康专业人员类型，用于输出全科医生的详细信息，包括类型、ID、姓名、部门以及是否擅长家庭医疗等。
class GeneralPractitioner extends HealthProfessional {
    private boolean isGoodAtFamilyMedicine;

    // 默认构造函数，满足Part 2中创建默认构造函数的要求
    public GeneralPractitioner() {
    }

    // 初始化所有实例变量的构造函数（包括基类的实例变量），满足Part 2中创建初始化所有实例变量构造函数的要求
    public GeneralPractitioner(int ID, String name, String department, boolean isGoodAtFamilyMedicine) {
        super(ID, name, department);
        this.isGoodAtFamilyMedicine = isGoodAtFamilyMedicine;
    }

    // 打印健康专业人员详细信息的方法，包括健康专业人员类型，用于输出全科医生的详细信息，包括类型、ID、姓名、部门以及是否擅长家庭医疗等。
    @Override
    public void printAllVariables() {
        if (super.getID() == 1) {
            System.out.println("健康专业人员详情如下:");
        }
        System.out.println("类型: 全科医生");
        super.printAllVariables();
        System.out.println("擅长家庭医疗: " + isGoodAtFamilyMedicine);
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作这些属性，例如在设置全科医生是否擅长家庭医疗的属性时使用。
    public boolean isGoodAtFamilyMedicine() {
        return isGoodAtFamilyMedicine;
    }

    public void setGoodAtFamilyMedicine(boolean goodAtFamilyMedicine) {
        this.isGoodAtFamilyMedicine = goodAtFamilyMedicine;
    }
}

// Specialist类（假设的另一种健康专业人员类型，子类），对应作业Part 2要求。创建代表专科医生的子类，继承自HealthProfessional类，需满足以下条件：
// 1. 至少一个额外实例变量区分类型，这里用specialtyField表示专长领域。
// 2. 一个默认构造函数，用于在创建专科医生对象时若未传入参数则使用默认设置初始化对象。
// 3. 初始化所有实例变量（包括基类实例变量）的构造函数，通过传入的参数初始化专科医生的ID、姓名、部门和专长领域等信息，调用基类构造函数初始化基类实例变量。
// 4. 打印健康专业人员详细信息的方法，包括健康专业人员类型，用于输出专科医生的详细信息，包括类型、ID、姓名、部门和专长领域等。
class Specialist extends HealthProfessional {
    private String specialtyField;

    // 默认构造函数
    public Specialist() {
    }

    // 初始化所有实例变量的构造函数（包括基类的实例变量）
    public Specialist(int ID, String name, String department, String specialtyField) {
        super(ID, name, department);
        this.specialtyField = specialtyField;
    }

    // 打印健康专业人员详细信息的方法，包括健康专业人员类型
    @Override
    public void printAllVariables() {
        if (super.getID() == 4) {
            System.out.println("健康专业人员详情如下:");
        }
        System.out.println("类型: 专科医生");
        super.printAllVariables();
        System.out.println("专长领域: " + specialtyField);
    }

    // Getter和Setter方法，用于访问和修改私有变量，方便在其他类中操作专长领域这个属性。
    public String getSpecialtyField() {
        return specialtyField;
    }

    public void setSpecialtyField(String specialtyField) {
        this.specialtyField = specialtyField;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}     



11111

222222