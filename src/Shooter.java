<<<<<<< HEAD
public class Shooter {
<<<<<<< HEAD
=======
    public Square getLoc() {
        return null;
    }
>>>>>>> ae122d9c08e34487ecebe0db4735510363e6ae1b
}
=======
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Shooter
{
	private boolean exists;
	private Image shooterIcon;
	private Projectile projectile;
	private Square location;

	public Shooter(boolean exists)
	{
		this.exists = exists;

		createIcon();
	}

	private void createIcon()
	{
		File icon = new File("shooter.jpg");
		try
		{
			shooterIcon = ImageIO.read(icon);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public boolean isExists()
	{
		return exists;
	}

	public void setExists(boolean exists)
	{
		this.exists = exists;
	}

	public Image getShooterIcon()
	{
		return shooterIcon;
	}

	public void setShooterIcon(Image shooterIcon)
	{
		this.shooterIcon = shooterIcon;
	}

	public Projectile getProjectile()
	{
		return projectile;
	}

	public void setProjectile(Projectile projectile)
	{
		this.projectile = projectile;
	}

	public Square getLocation()
	{
		return location;
	}

	public void setLocation(Square location)
	{
		this.location = location;
	}
}
>>>>>>> ca24d43b1e852420212908a83be22a4bda328f92
