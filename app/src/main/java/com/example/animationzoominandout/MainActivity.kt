package com.example.animationzoominandout

import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    lateinitvar card: CardView
    lateinitvar rotateButton: Button
    lateinitvar scale: Button
    lateinitvar translateButton: Button
    lateinitvar SlideUp: Button
    lateinitvar SlideDown: Button
    lateinitvar SlideLeft: Button
    lateinitvar SlideRight: Button
    lateinitvar fadeIn: Button
    lateinitvar fadeOut: Button
    lateinitvar zoomIn: Button
    lateinitvar zoomOut: Button
    overridefun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedStateRegistry)
        setContentView(R.layout.activity_main)
        card= findViewById(R.id.imgvw)
        rotateButton= findViewById<Button>(R.id.Rotate)
        translateButton= findViewById<Button>(R.id.translate)
        SlideUp= findViewById<Button>(R.id.SlideUp)
        SlideDown= findViewById<Button>(R.id.SlideDown)
        SlideLeft= findViewById<Button>(R.id.SlideLeft)
        SlideRight= findViewById<Button>(R.id.SlideRight)
        fadeIn= findViewById<Button>(R.id.btnFadeIn)
        fadeOut= findViewById<Button>(R.id.btnFadeOut)
        zoomIn= findViewById<Button>(R.id.zoomIn)
        zoomOut= findViewById<Button>(R.id.zoomOut)
        scale= findViewById<Button>(R.id.Scale)
        zoomOut.setOnClickListener {
            val animZoomOut = AnimationUtils.loadAnimation(this,
                R.anim.zoom_out)
            card.startAnimation(animZoomOut)
        }
        SlideUp.setOnClickListener {
            val slideUp = AnimationUtils.loadAnimation(this,
                R.anim.slide_up)
            card.startAnimation(slideUp)
        }
        SlideDown.setOnClickListener {
            val slide_down = AnimationUtils.loadAnimation(this,
                R.anim.slide_down)
            card.startAnimation(slide_down)
        }
        SlideLeft.setOnClickListener {
            val slide_left = AnimationUtils.loadAnimation(this,
                R.anim.slide_left)
            card.startAnimation(slide_left)
        }
        SlideRight.setOnClickListener {
            val slide_right = AnimationUtils.loadAnimation(this,
                R.anim.slide_right)
            card.startAnimation(slide_right)
        }
        fadeIn.setOnClickListener{
            val animZoomIn= AnimationUtils.loadAnimation(this,
                R.anim.fade_in)
            card.startAnimation(animZoomIn)
        }
        fadeOut.setOnClickListener{
            val animZoomIn= AnimationUtils.loadAnimation(this,
                R.anim.fade_out)
            card.startAnimation(animZoomIn)
        }
        zoomIn.setOnClickListener{
            val animZoomIn= AnimationUtils.loadAnimation(this,
                R.anim.zoom_in)
            card.startAnimation(animZoomIn)
        }
        rotateButton.setOnClickListener{
            rotater()
        }
        translateButton.setOnClickListener{
            translater()
        }
        scale.setOnClickListener{
            scaler()
        }
    }
