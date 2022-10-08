package com.codepath.articlesearch

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var mediaImageViewH: ImageView
    private lateinit var mediaImageViewV: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var bylineTextView: TextView
    private lateinit var abstractTextView: TextView
    private lateinit var airTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Find the views for the screen
        mediaImageViewV = findViewById(R.id.mediaImageVertical)
        titleTextView = findViewById(R.id.mediaTitle)
        bylineTextView = findViewById(R.id.mediaByline)
        abstractTextView = findViewById(R.id.mediaAbstract)
        airTextView = findViewById(R.id.firstAirDate)

        // Get the extra from the Intent
        val article = intent.getSerializableExtra(ARTICLE_EXTRA) as Article

        // Set the title, byline, and abstract information from the article
        titleTextView.text = article.headline
        bylineTextView.text = "User Rating: " + article.byline
        abstractTextView.text = article.abstract
        airTextView.text = "First Aired: " + article.first_air_date

        // Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500" + article.mediaImageUrl2)
            .centerInside()
            .transform(RoundedCorners(30))
            .into(mediaImageViewV)
    }
}