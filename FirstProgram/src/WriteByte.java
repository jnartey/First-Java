import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class WriteByte {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("src/files/sample.txt");
		ReadableByteChannel source = input.getChannel();
		FileOutputStream output = new FileOutputStream("src/files/sampleTo.txt");
		WritableByteChannel destination = output.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(20 * 1024);
		
		
		while(source.read(buffer) != -1) {
			buffer.flip();
			
			while(buffer.hasRemaining()) {
				destination.write(buffer);
			}
			
			buffer.clear();
						
		}
		
		source.close();
		destination.close();
		
	}

}
