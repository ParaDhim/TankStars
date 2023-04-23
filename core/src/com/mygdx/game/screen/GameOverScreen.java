package com.mygdx.game.screen;

//package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.build;

public class GameOverScreen implements Screen {
    final build game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;

    public GameOverScreen(final build game) {
        this.game = game;
        backgroundImage = new Texture(Gdx.files.internal("Screens/gameEnd.png"));
        backgroundTexture = new TextureRegion(backgroundImage, 0, 0, backgroundImage.getWidth(), backgroundImage.getHeight());


        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 0);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(backgroundTexture, 0, 0, 800, 480);
//        game.font.draw(game.batch, "Welcome to Drop!", 300, 240);
//        game.font.draw(game.batch, "Click anywhere to begin!", 300, 140);
//        game.font.draw(game.batch, "check", 620, 420);
        game.batch.end();

//    }


        if (Gdx.input.getX() > 141 && Gdx.input.getY() > 546 && Gdx.input.getX() < 485 && Gdx.input.getY() < 619 && Gdx.input.justTouched()) {
            game.setScreen(new SplashScreen(game));
            dispose();
        }else if (Gdx.input.getX() > 785 && Gdx.input.getY() > 546 && Gdx.input.getX() < 1119 && Gdx.input.getY() < 619 && Gdx.input.justTouched()) {
            game.setScreen(new MenuScreen(game));
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}

