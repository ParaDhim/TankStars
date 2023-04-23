package com.mygdx.game.screen;
//package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.build;

public class MenuScreen implements Screen {
    final build game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;

    public MenuScreen(final build game) {
        this.game = game;
        backgroundImage = new Texture(Gdx.files.internal("Screens/menu.png"));
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


        if (Gdx.input.getX() > 749 && Gdx.input.getX() < 1200 && Gdx.input.getY() > 55 && Gdx.input.getY() < 138 && Gdx.input.justTouched()) {
//        if (((Gdx.graphics.getHeight() - Gdx.input.getY()) < 460) && ((Gdx.graphics.getHeight() - Gdx.input.getY()) > 400) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) > 600) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) < 650) && Gdx.input.isTouched()) {
//        if (((Gdx.graphics.getHeight() - Gdx.input.getY()) < 400) && ((Gdx.graphics.getHeight() - Gdx.input.getY()) > 400) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) > 600) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) < 650) && Gdx.input.isTouched()) {
//        if (Gdx.input.isTouched()) {
            game.setScreen(new LoadGameScreen(game));
            dispose();
        }

        if (Gdx.input.getX() > 749 && Gdx.input.getX() < 1200 && Gdx.input.getY() > 187 && Gdx.input.getY() < 278 && Gdx.input.justTouched()) {
//        if (((Gdx.graphics.getHeight() - Gdx.input.getY()) < 460) && ((Gdx.graphics.getHeight() - Gdx.input.getY()) > 400) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) > 600) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) < 650) && Gdx.input.isTouched()) {
//        if (((Gdx.graphics.getHeight() - Gdx.input.getY()) < 400) && ((Gdx.graphics.getHeight() - Gdx.input.getY()) > 400) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) > 600) && ((Gdx.graphics.getWidth() - Gdx.input.getX()) < 650) && Gdx.input.isTouched()) {
//        if (Gdx.input.isTouched()) {
            game.setScreen(new TankSelection1(game));
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

