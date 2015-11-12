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

}
