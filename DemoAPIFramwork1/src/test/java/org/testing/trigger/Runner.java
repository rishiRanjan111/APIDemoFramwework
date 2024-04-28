package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetallRequest;
import org.testing.testScripts.TC3_getParticularRequest;
import org.testing.testScripts.TC4_PutRequest;
import org.testing.testScripts.TC5_deleteRequest;
import org.testing.testScripts.TC6_getAllEmployees;
import org.testing.testScripts.TC7_getParticularProduct;
import org.testing.testScripts.TC8_PostRealCreate;



public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testcase1();
		TC2_GetallRequest tc2= new TC2_GetallRequest();
		tc2.testcase2();
		TC3_getParticularRequest tc3 = new TC3_getParticularRequest();
		tc3.testcase3();
		TC4_PutRequest tc4= new TC4_PutRequest();
		tc4.testcase4();
		TC5_deleteRequest tc5 = new TC5_deleteRequest();
		tc5.testcase5();
		TC6_getAllEmployees tc6 =new TC6_getAllEmployees();
		tc6.testcase6();
		TC7_getParticularProduct tc7 = new TC7_getParticularProduct();
		tc7.testcase7();
		TC8_PostRealCreate tc8 = new TC8_PostRealCreate();
		tc8.testcase8();

		
		
		

	}

}
