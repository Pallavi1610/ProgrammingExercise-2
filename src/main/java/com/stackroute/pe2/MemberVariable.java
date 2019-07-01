package main.java.com.stackroute.pe2;

public class MemberVariable {
    Member member=new Member();
    public String displayMemberValues(String name,int age,double salary)
    {
        member.name=name;
        member.age=age;
        member.salary=salary;
        return "Member's name:"+name+"\n"+"Member's age:"+age+"\n"+"Member's salary:"+salary;
    }

}
