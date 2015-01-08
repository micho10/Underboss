package jp.co.nekosoft.underboss.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import jp.co.nekosoft.underboss.R;

/**
 * Created by micho on 08/01/15.
 */
public class FactionAdapter extends ArrayAdapter<String> {


    public FactionAdapter(Context context, String[] values) {
        super(context, R.layout.collection_row_layout_2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View factionView = inflater.inflate(R.layout.collection_row_layout_2, parent, false);
        String faction = getItem(position);
        TextView textView = (TextView) factionView.findViewById(R.id.factionTextView);
        textView.setText(faction);

        /* OPTIONAL -- Not needed if image was inserted in the layout using the 'src' attribute */
        ImageView imageView = (ImageView) factionView.findViewById(R.id.factionLogo);
        imageView.setImageResource(R.drawable.khador);

        return factionView;
    }

}
