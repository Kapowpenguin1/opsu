package fluddokt.opsu.fake;

import com.badlogic.gdx.Gdx;

public class MusicGdx extends AbsMusic {

	com.badlogic.gdx.audio.Music music;

	public MusicGdx(String path) {
		music = Gdx.audio.newMusic(ResourceLoader.getFileHandle(path));
	}

	public boolean setPosition(float f) {
		music.setPosition(f);
		return true;
	}

	public void loop() {
		if (music.isPlaying())
			music.stop();
		music.setLooping(true);
		music.play();

	}

	public void play() {
		if (music.isPlaying())
			music.stop();
		music.setLooping(false);
		music.play();
	}

	public boolean playing() {
		try {
			return music.isPlaying();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void pause() {
		music.pause();
	}

	public void resume() {
		music.play();
	}

	public void setVolume(float volume) {
		music.setVolume(volume);
	}

	public void stop() {
		music.stop();
	}

	public void fade(int duration, float f, boolean b) {
		// TODO Auto-generated method stub
		// final int dura = duration;
		
		/*new Thread() {
			@Override
			public void run() {
				float mult = 1;
				float sub = (1 / 60f) / (dura / 1000f);
				float volume = music.getVolume();
				while (mult >= 0) {
					try {
						mult -= sub;
						// System.out.println("Fade:"+mult+" "+sub);
						music.setVolume(volume * mult);
						Thread.sleep(16);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				music.stop();
			}
		}.start();*/

		music.stop();
	}

	@Override
	public float getPosition() {
		return music.getPosition();
	}

	public void dispose() {
		music.dispose();
	}

}