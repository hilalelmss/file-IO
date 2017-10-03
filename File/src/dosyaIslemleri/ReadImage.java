package dosyaIslemleri;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ReadImage {
	public static void main(String[] args) {
		BufferedImage image = null;
		File file = new File("D:\\project\\apps\\file-IO\\File\\image.JPG");

		try {
			image = ImageIO.read(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		JLabel jLabel = new JLabel(new ImageIcon(image));
		frame.add(jLabel);
		ImageIcon imageIcon = new ImageIcon(fitimage(image, frame.getWidth(), frame.getHeight()));
		jLabel.setIcon(imageIcon);
		frame.setVisible(true);
	}

	private static Image fitimage(Image img, int w, int h) {
		BufferedImage resizedimage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = resizedimage.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(img, 0, 0, w, h, null);
		g2.dispose();
		return resizedimage;
	}

}
