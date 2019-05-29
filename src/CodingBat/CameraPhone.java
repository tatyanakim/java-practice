package CodingBat;

public class CameraPhone {

	int memorySize;
	int imageSize;

	public CameraPhone(int imageSize,int memorySize) {
		this.memorySize = memorySize;
		this.imageSize = imageSize;

	}

	public int numPictures() {
		return (memorySize * 1000) / imageSize;
	}

	public static void main(String[] args) {
		CameraPhone c = new CameraPhone(2, 64);
		System.out.println(c.numPictures());
	}
}