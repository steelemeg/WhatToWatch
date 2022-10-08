package com.codepath.articlesearch

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners


const val ARTICLE_EXTRA = "ARTICLE_EXTRA"
private const val TAG = "ArticleAdapter"

class ArticleAdapter(private val context: Context, private val articles: List<Article>) :
    RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_article, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val article = articles[position]
        holder.bind(article)
    }

    override fun getItemCount() = articles.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

        private val mediaImageViewHorizontal = itemView.findViewById<ImageView>(R.id.mediaImageHorizontal)
        private val mediaImageViewVertical = itemView.findViewById<ImageView>(R.id.mediaImageVertical)
        private val titleTextView = itemView.findViewById<TextView>(R.id.mediaTitle)
//

        init {
            itemView.setOnClickListener(this)
        }

    fun bind(article: Article) {
        titleTextView.text = article.headline
        //abstractTextView.text = article.abstract
        Log.v("images", article.mediaImageUrl.toString() + " alternate " + article.mediaImageUrl2.toString())
        Glide.with(context)
            .load("https://image.tmdb.org/t/p/w500" + article.mediaImageUrl)
            .transform(RoundedCorners(30))
            .into(mediaImageViewHorizontal)
    }

        override fun onClick(v: View?) {
            // Get selected article
            val article = articles[absoluteAdapterPosition]

            //  Navigate to Details screen and pass selected article
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(ARTICLE_EXTRA, article)
            context.startActivity(intent)
        }
    }
}