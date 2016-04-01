package unit.length;

import exception.TwoDifferentMeasurementAreNotComparable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import unit.LengthUnit;
import unit.Measurable;
import unit.VolumeUnit;

import static org.junit.Assert.*;

public class MeasurableTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void twoLengthOneFeetShouldBeEqualToTwelveInch() throws TwoDifferentMeasurementAreNotComparable {
        Measurable _1ft = new Measurable(1, LengthUnit.FEET);
        Measurable _12in = new Measurable(12,LengthUnit.INCH);
        assertTrue(_1ft.compare(_12in));
    }
    @Test
    public void twoVolumeThreePointSevenFiveLiterAndOneGallonShouldBeEqual() throws TwoDifferentMeasurementAreNotComparable {
        Measurable _1gallon = new Measurable(1, VolumeUnit.GALLON);
        Measurable _1Liter = new Measurable(3.78,VolumeUnit.LITER);
        assertTrue(_1gallon.compare(_1Liter));
    }

    @Test
    public void compareBetweenLiterAndVolumeShouldThrowAnException() throws TwoDifferentMeasurementAreNotComparable {
        thrown.expect(TwoDifferentMeasurementAreNotComparable.class);
        thrown.expectMessage("two different measurement are not comparable or addable");
        Measurable _1Liter = new Measurable(1,VolumeUnit.LITER);
        Measurable _1ft = new Measurable(1,LengthUnit.FEET);
        _1ft.compare(_1Liter);
    }

    @Test
    public void twoInchShouldBeEqualTo5Centimeter() throws TwoDifferentMeasurementAreNotComparable {
        Measurable _5cm =new Measurable(5,LengthUnit.CENTIMETER);
        Measurable _2inch = new Measurable(2,LengthUnit.INCH);
        assertTrue(_5cm.compare(_2inch));
    }

    @Test
    public void oneCentimeterShouldBeComparableWithTenMillimeter() throws TwoDifferentMeasurementAreNotComparable {
        Measurable _10mm = new Measurable(10,LengthUnit.MILLIMETER);
        Measurable _1cm = new Measurable(1,LengthUnit.CENTIMETER);
        assertTrue(_1cm.compare(_10mm));

    }

    @Test
    public void additionOfTwoLengthShouldGiveBckALength() throws TwoDifferentMeasurementAreNotComparable {
        Measurable _2in = new Measurable(2,LengthUnit.INCH);
        Measurable expected_4in = new Measurable(4,LengthUnit.INCH);
        Measurable result =_2in.add(_2in);
        assertEquals(expected_4in,result);
    }
    @Test
    public void additionOfTwoVolumeShouldGiveAVolume() throws TwoDifferentMeasurementAreNotComparable {
        Measurable _1Gallon = new Measurable(1,VolumeUnit.GALLON);
        Measurable _1Liter = new Measurable(1,VolumeUnit.LITER);
        Measurable result =_1Liter.add(_1Gallon);
        assertEquals(new Measurable(4.78,VolumeUnit.LITER),(result));
    }

    @Test
    public void twoDifferentTypeMeasurementAdditionShouldThrowAnException() throws TwoDifferentMeasurementAreNotComparable {
        thrown.expect(TwoDifferentMeasurementAreNotComparable.class);
        thrown.expectMessage("two different measurement are not comparable or addable");
        Measurable _1Liter = new Measurable(1,VolumeUnit.LITER);
        Measurable _1inch = new Measurable(1,LengthUnit.INCH);
        _1inch.add(_1Liter);
    }
}