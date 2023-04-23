package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.build;

public class LoadGameScreen implements Screen {
    final build game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;

    public LoadGameScreen(final build game) {
        this.game = game;
        backgroundImage = new Texture(Gdx.files.internal("Screens/loadgame.png"));
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

//        if (Gdx.input.isTouched()) {
//            System.out.println(Gdx.input.getX());
//            System.out.println(Gdx.input.getY());
//        }
//    }


        if (Gdx.input.getX() > 420 && Gdx.input.getY() > 106 && Gdx.input.getX() < 908 && Gdx.input.getY() < 193 && Gdx.input.justTouched()) {
            game.setScreen(new confirmation(game));
            dispose();
        } else if (Gdx.input.getX() > 420 && Gdx.input.getY() > 262 && Gdx.input.getX() < 908 && Gdx.input.getY() < 334 && Gdx.input.justTouched()) {
            game.setScreen(new confirmation(game));
            dispose();
        } else if (Gdx.input.getX() > 420 && Gdx.input.getY() > 430 && Gdx.input.getX() < 908 && Gdx.input.getY() < 490 && Gdx.input.justTouched()) {
            game.setScreen(new confirmation(game));
            dispose();
        } else if (Gdx.input.getX() > 420 && Gdx.input.getY() > 507 && Gdx.input.getX() < 908 && Gdx.input.getY() < 594 && Gdx.input.justTouched()) {
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
