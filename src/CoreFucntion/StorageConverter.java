package CoreFucntion;

/**
 * This class is use for handle a Storage Conversion
 * Storage unit that we can to convert are Byte , Kilobyte (KB) , Megabyte (MB) , GigaByte (GB) , TeraByte (TB) , PetaByte (PB)
 * 1 KB = 1024 Byte
 * 1 MB = 1024 KB = 1024*1024 Byte
 * 1 GB = 1024 MB = 1024^3 Byte
 * 1 TB = 1024 GB = 1024^4 Byte
 * 1 PB = 1024 Tb = 1024^5 Byte
 */
public class StorageConverter {
/////////////////--------------------///////////////

    /**
     * covert Byte to KB
     * 1 KB = 1024 Byte
     * @param numByte is long 
     * @return KB
     */
    public double byte2KB(double numByte) {
	return (double)numByte / 1024.0;
    }

    /**
     * convert Byte to MB
     * 1 MB = 1024 KB = 1024*1024 Byte
     * @param numByte is long
     * @return MB
     */
    public double byte2MB(double numByte) {
	return byte2KB(numByte) / 1024.0;
    }

    /**
     * convert Byte to GB
     * @param numByte is long
     * 1 GB = 1024 MB = 1024^3 Byte
     * @return GB
     */
    public double byte2GB(double numByte) {
	return byte2MB(numByte) / 1024.0;
    }

    /**
     * convert Byte to TB
     * @param numByte is long
     * 1 TB = 1024 GB = 1024^4 Byte
     * @return TB
     */
    public double byte2TB(double numByte) {
	return byte2GB(numByte) / 1024.0;
    }

    /**
     * covert Byte to PB
     * @param numByte is long
     * 1 PB = 1024 Tb = 1024^5 Byte
     * @return PB
     */
    public double byte2PB(double numByte) {
	return byte2TB(numByte) / 1024.0;
    }

/////////////////--------------------///////////////

    /**
     *This method is use to convert Kilobyte to byte
     * @param kilobyte is long
     * @return byte
     */
    public double kb2Byte(double kilobyte) {
	return kilobyte * 1024;
    }

    /**
     *This method is use to convert Kilobyte to Megabyte
     * @param kilobyte is long
     * @return MB
     */
    public double kb2MB(double kilobyte) {
	return (double)kilobyte / 1024;
    }

    /**
     *This method is use to convert Kilobyte to GigaByte
     * @param kilobyte is long
     * @return GB
     */
    public double kb2GB(double kilobyte) {
	return kb2MB(kilobyte) / 1024;
    }

    /**
     *This method is use to convert Kilobyte to TeraByte
     * @param kilobyte is long
     * @return TB
     */
    public double kb2TB(double kilobyte) {
	return kb2GB(kilobyte) / 1024;
    }

    /**
     *This method is use to convert kilobyte to PetaByte
     * @param kilobyte is long
     * @return PetaByte
     */
    public double kb2PB(double kilobyte) {
	return kb2TB(kilobyte) / 1024;
    }

/////////////////--------------------///////////////
    /**
     * This method is use to convert MegaByte to Byte
     * @param megabyte is long
     * @return Byte
     */
    public double mb2Byte(double megabyte) {
	return mb2KB(megabyte) * 1024;
    }
    /**
     * This method is use to convert MegaByte to Kilobyte
     * @param megabyte is long
     * @return Kilobyte
     */
    public double mb2KB(double megabyte) {
	return megabyte * 1024;
    }
    /**
     * This method is use to convert Megabyte to GigaByte
     * @param megabyte is long
     * @return GigaByte
     */
    public double mb2GB(double megabyte) {
	return (double)megabyte / 1024;
    }
    /**
     * This method is use to convert MegaByte to TeraBtye
     * @param megabyte is long
     * @return TeraByte
     */
    public double mb2TB(double megabyte) {
	return mb2GB(megabyte) / 1024;
    }
    /**
     * This method is use to convert MegaByte To PeraByte
     * @param megabyte is long
     * @return PeraByte
     */
    public double mb2PB(double megabyte) {
	return mb2TB(megabyte) / 1024;
    }

/////////////////--------------------///////////////
    /**
     * This method is use to convert GigaByte to Byte
     * @param gigabyte is long
     * @return Byte 
     */
    public double gb2Byte(double gigabyte) {
	return gb2KB(gigabyte) * 1024;
    }
    /**
     * This method is use to convert GigaByte to Kilobyte
     * @param gigabyte is long
     * @return kiloByte
     */
    public double gb2KB(double gigabyte) {
	return gb2MB(gigabyte) * 1024;
    }
    /**
     * This method is use to convert GigaByte to MegaByte
     * @param gigabyte is long
     * @return MegaBte
     */
    public double gb2MB(double gigabyte) {
	return gigabyte * 1024;
    }
    /**
     * This method is use to convert GigaByte to TeraBtye
     * @param gigabyte is long
     * @return TeraByte
     */
    public double gb2TB(double gigabyte) {
	return (double)gigabyte / 1024;
    }
    /**
     * This method is use to convert GigaByte To PeraByte
     * @param gigabyte is long
     * @return PeraByte
     */
    public double gb2PB(double gigabyte) {
	return gb2TB(gigabyte) / 1024;
    }

/////////////////--------------------///////////////
    /**
     * This method is use to convert TeraByte To Byte
     * @param terabyte is long
     * @return Byte
     */
    public double tb2Byte(double terabyte) {
	return tb2KB(terabyte) * 1024;
    }
    /**
     * This method is use to convert TeraByte To KiloByte
     * @param terabyte is long
     * @return KiloByte
     */
    public double tb2KB(double terabyte) {
	return tb2MB(terabyte) * 1024;
    }
    /**
     * This method is use to convert TeraByte To MegaByte
     * @param terabyte is long
     * @return MegaByte
     */
    public double tb2MB(double terabyte) {
	return tb2GB(terabyte) * 1024;
    }
    /**
     * This method is use to convert TeraByte To GigaByte
     * @param terabyte is long
     * @return GigaByte
     */
    public double tb2GB(double terabyte) {
	return terabyte * 1024;
    }
    /**
     * This method is use to convert TeraByte To PeraByte
     * @param terabyte is long
     * @return PeraByte
     */
    public double tb2PB(double terabyte) {
	return (double)terabyte / 1024;
    }

/////////////////--------------------///////////////
    /**
     * This method is use to convert PeraByte To Byte
     * @param petabyte is long
     * @return Byte
     */
    public double pb2Byte(double petabyte) {
	return pb2KB(petabyte) * 1024;
    }
    /**
     * This method is use to convert PeraByte To KiloByte
     * 
     * @param petabyte is long
     * @return KiloByte
     */
    public double pb2KB(double petabyte) {
	return pb2MB(petabyte) * 1024;
    }
    /**
     * This method is use to convert PeraByte To MegaByte
     * 
     * @param petabyte is long
     * @return MegaByet
     */
    public double pb2MB(double petabyte) {
	return pb2GB(petabyte) * 1024;
    }
    /**
     * This method is use to convert PeraByte To GigaByte
     * 
     * @param petabyte is long
     * @return GigaByte
     */
    public double pb2GB(double petabyte) {
	return pb2TB(petabyte) * 1024;
    }
    /**
     * This method is use to convert PeraByte To TeraByte
     * @param petabyte is long
     * @return TB
     */
    public double pb2TB(double petabyte) {
	return petabyte * 1024;
    }

}
