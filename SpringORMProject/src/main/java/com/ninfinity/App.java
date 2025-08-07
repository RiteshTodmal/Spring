package com.ninfinity;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ninfinity.dao.StudentDao;
import com.ninfinity.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ninfinity/config.xml");
		StudentDao studentdao = context.getBean("studentdao",StudentDao.class);
		int choice;
		String constChoice;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Menu : Spring ORM Application");
			System.out.println("-----------------------------");
			System.out.println("1.Get One Student \n 2. Get All Studen\n 3.Add Student \n 4.Update Student \n 5.Delete Student \n 6.Exit \n Enter Your Choice: ");
			choice = scanner.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter ID for Student:");
				int id;
				id = scanner.nextInt();

				Student s1 = studentdao.getOneStudent(id);
				System.out.println("Student Info");
				System.out.println(s1);

				break;

			case 2:
				System.out.println("List of All Students");
				System.out.println("------------------------------");

				List<Student> sList = studentdao.getAllStudents();

				for(Student s:sList) {
					System.out.println(s);
				}
				break;

			case 3:
				int studentid;
				String firstName,lastName,city;
				System.out.println("Enter id:");
				studentid = scanner.nextInt();
				System.out.println("Enter FirstName: ");
				firstName = scanner.next();
				System.out.println("Enter LastName: ");
				lastName = scanner.next();
				System.out.println("city: ");
				city = scanner.next();

				Student s2 = new Student(studentid, firstName, lastName, city);
				int result = studentdao.addStudent(s2);
				System.out.println(result +" Student Added in database");

				break;

			case 4:

				System.out.println("Enter Student ID For Update: ");
				id = scanner.nextInt();
				Student s3 = studentdao.getOneStudent(id);
				System.out.print("Enter The First Name To Update: ");
				firstName = scanner.next();
				s3.setFirstName(firstName);
				System.out.print("Enter lastName Name to Upadte");
				lastName= scanner.next();
				s3.setLastName(lastName);
				System.out.print("Enter The City To Update: ");
				city = scanner.next();
				s3.setCity(city);
				result = studentdao.update(s3);

				System.out.println(result +" Record Updated");
				break;

			case 5:
				System.out.print("Enter The Id to Delete The Record : ");
				id = scanner.nextInt();
				Student s4 = studentdao.getOneStudent(id);

				result = studentdao.delete(s4);
				System.out.println(result + " Record Deleted");
				break;
			case 6:
				System.out.println("Thank you for Using ORM App");
				System.exit(0);
			default :
				System.out.println("Dear Please Enter Valid Choice");

			}

			System.out.println("Continue (y/n) ? :: ");
			constChoice = scanner.next();
		}while(constChoice.equalsIgnoreCase("y"));   

	}
}
