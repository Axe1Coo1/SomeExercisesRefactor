package sort;


import org.junit.Test;

import static sort.StructureTwoDimensionArray.makeStructureArray;

public class StructureTwoDimensionArrayTest {
    @Test
    public void StructureTest(){
        for (int i = 2; i <= 20; i += 2) {

            makeStructureArray(i);
        }
    }
}
