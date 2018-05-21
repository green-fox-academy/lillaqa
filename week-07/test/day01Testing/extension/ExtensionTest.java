package day01Testing.extension;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.Assert.*;

public class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and2is4() {
        assertEquals(4, extension.add(2, 2));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testAdd_3and3is6() {
        assertEquals(6, extension.add(3,3));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(5, extension.maxOfThree(5, 4, 3));
    }

    @Test
    void testMaxOfThree_second() {
        assertEquals(8, extension.maxOfThree(3,8,7));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(5, extension.maxOfThree(3, 4, 5));
    }

    @Test
    void testMedian_four() {
        assertEquals(6, extension.median(Arrays.asList(7,5,3,10)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testMedian_six() {
        assertEquals(5, extension.median(Arrays.asList(1,2,3,7,8,9)));
    }

    @Test
    void testMedian_seven() {
        assertEquals(5, extension.median(Arrays.asList(5,9,7,4,9,2,3)));
    }

    @Test
    void testMedian_nine() {
        assertEquals(5, extension.median(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }

    @Test
    void testTranslate_konkre() {
        assertEquals("kovonkreve", extension.translate("konkre"));
    }

    @Test
    void testTranslate_yoyot() {
        assertEquals("yovoyovot", extension.translate("yoyot"));
    }

    @Test
    void testTranslate_mama() {
        assertEquals("mavamava", extension.translate("mama"));
    }
}
