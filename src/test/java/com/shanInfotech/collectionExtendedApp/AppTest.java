package com.shanInfotech.collectionExtendedApp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class AppTest {
InterviewScheduler scheduler;
@Before //it's like constructor which initializes before methode getting loaded
 public void setup() {
	scheduler=new InterviewScheduler();
	    scheduler.ScheduleInterview(new Interview(1, "Anita", 82, "10:00 AM"));
	    scheduler.ScheduleInterview(new Interview(2, "Yashu", 68, "10:30 AM"));
	    scheduler.ScheduleInterview(new Interview(3, "Subbu", 75, "11:00 AM"));
	    scheduler.walkCandidate(new Interview(4, "Deepa", 91, "NOW"));

 }   
	    @Test
	     public void testSchedulerCoreFlow() {
	    assertEquals("Anita", scheduler.shedulequeue.peek().getCandidateName()); // FIFO Test
	    assertEquals("Deepa", scheduler.walkInDeque.peekFirst().getCandidateName()); // walk
	    assertEquals("Yashu", scheduler.topPerformanceQueue.peek().getCandidateName()); // priority
	}

 @Test
 public void testTopScorersAbove70() {
	 List<String> expectedNames = Arrays.asList("Anita","Subbu");
	 
	 List<String> topScores = scheduler.topPerformanceQueue.stream().filter(i -> i.getScore()>70).map(Interview::getCandidateName).sorted().toList();
	 assertEquals(expectedNames,topScores);
 }
   @After
   public void tearDown() {
	   scheduler=null;
   }
 }

