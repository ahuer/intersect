package unit.com.points.intersect

import static org.junit.Assert.*
import org.junit.Test

import com.points.intersect.Intersection

class IntersectTest {
	
	@Test
	public void testIntersectNoDupesWithBasicLists(){
		
		def listA = [1,2]
		def listB = [2,3,4]
		
		assertEquals([2], Intersection.intersectNoDupes(listA, listB))
	}
	
	@Test
	public void testIntersectNoDupesWithNoIntersect(){
		
		def listA = [1,2]
		def listB = [3,4]
		
		assertEquals([], Intersection.intersectNoDupes(listA, listB))
	}
	
	@Test
	public void testIntersectNoDupesWithEmptyFirstList(){
		
		def listA = []
		def listB = [2,3,4]
		
		assertEquals([], Intersection.intersectNoDupes(listA, listB))
	}
	
	@Test
	public void testIntersectNoDupesWithEmptySecondList(){
		
		def listA = [2,3,4]
		def listB = []
		
		assertEquals([], Intersection.intersectNoDupes(listA, listB))
	}
	
	@Test
	public void testIntersectNoDupesWithDupes(){
		
		def listA = [1,2,3,6,7,2]
		def listB = [2,3,4,3,5,1]
		
		assertEquals([1,2,3], Intersection.intersectNoDupes(listA, listB))
	}
	
	@Test
	public void testIntersectWithDupesWithBasicLists(){
		
		def listA = [1,2,3,2]
		def listB = [1,2]
		
		assertEquals([1,2,2], Intersection.intersectWithDupes(listA, listB))
	}
	
	@Test
	public void testIntersectWithDupesWithNoIntersect(){
		
		def listA = [1,2,3,2]
		def listB = [4,5]
		
		assertEquals([], Intersection.intersectWithDupes(listA, listB))
	}
	
	@Test
	public void testIntersectWithDupesWithEmptyFirstList(){
		
		def listA = []
		def listB = [1,2]
		
		assertEquals([], Intersection.intersectWithDupes(listA, listB))
	}
	
	@Test
	public void testIntersectWithDupesWithEmptySecondList(){
		
		def listA = [1,2,3]
		def listB = []
		
		assertEquals([], Intersection.intersectWithDupes(listA, listB))
	}
	
	@Test
	public void testIntersectWithDupesWithManyDupes(){
		
		def listA = [1,2,3,2,3]
		def listB = [2,3,3,3,1,1]
		
		assertEquals([1,1,2,2,3,3,3,3], Intersection.intersectWithDupes(listA, listB))
	}

}
