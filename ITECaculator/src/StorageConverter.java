import com.ibm.xml.resolver.apps.resolver;

import sun.util.logging.resources.logging;

public class StorageConverter {
/////////////////--------------------///////////////

    double byte2KB(long numByte) {
	return (double)numByte / 1024.0;
    }

    double byte2MB(long numByte) {
	return byte2KB(numByte) / 1024.0;
    }

    double byte2GB(long numByte) {
	return byte2MB(numByte) / 1024.0;
    }

    double byte2TB(long numByte) {
	return byte2GB(numByte) / 1024.0;
    }

    double byte2PB(long numByte) {
	return byte2TB(numByte) / 1024.0;
    }

/////////////////--------------------///////////////
    long kb2Byte(long kilobyte) {
	return kilobyte * 1024;
    }

    double kb2MB(long kilobyte) {
	return (double)kilobyte / 1024;
    }

    double kb2GB(long kilobyte) {
	return kb2MB(kilobyte) / 1024;
    }

    double kb2TB(long kilobyte) {
	return kb2GB(kilobyte) / 1024;
    }

    double kb2PB(long kilobyte) {
	return kb2TB(kilobyte) / 1024;
    }

/////////////////--------------------///////////////
    long mb2Byte(long megabyte) {
	return mb2KB(megabyte) * 1024;
    }

    long mb2KB(long megabyte) {
	return megabyte * 1024;
    }

    double mb2GB(long megabyte) {
	return (double)megabyte / 1024;
    }

    double mb2TB(long megabyte) {
	return mb2GB(megabyte) / 1024;
    }

    double mb2PB(long megabyte) {
	return mb2TB(megabyte) / 1024;
    }

/////////////////--------------------///////////////
    long gb2Byte(long gigabyte) {
	return gb2KB(gigabyte) * 1024;
    }

    long gb2KB(long gigabyte) {
	return gb2MB(gigabyte) * 1024;
    }

    long gb2MB(long gigabyte) {
	return gigabyte * 1024;
    }

    double gb2TB(long gigabyte) {
	return (double)gigabyte / 1024;
    }

    double gb2PB(long gigabyte) {
	return gb2TB(gigabyte) / 1024;
    }

/////////////////--------------------///////////////
    long tb2Byte(long terabyte) {
	return tb2KB(terabyte) * 1024;
    }

    long tb2KB(long terabyte) {
	return tb2MB(terabyte) * 1024;
    }

    long tb2MB(long terabyte) {
	return tb2GB(terabyte) * 1024;
    }

    long tb2GB(long terabyte) {
	return terabyte * 1024;
    }

    double tb2PB(long terabyte) {
	return (double)terabyte / 1024;
    }

/////////////////--------------------///////////////
    long pb2Byte(long petabyte) {
	return pb2KB(petabyte) * 1024;
    }

    long pb2KB(long petabyte) {
	return pb2MB(petabyte) * 1024;
    }

    long pb2MB(long petabyte) {
	return pb2GB(petabyte) * 1024;
    }

    long pb2GB(long petabyte) {
	return pb2TB(petabyte) * 1024;
    }

    long pb2TB(long petabyte) {
	return petabyte * 1024;
    }

}
