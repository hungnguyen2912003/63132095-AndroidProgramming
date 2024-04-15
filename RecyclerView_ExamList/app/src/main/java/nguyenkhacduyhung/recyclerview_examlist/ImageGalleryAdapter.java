package nguyenkhacduyhung.recyclerview_examlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class ImageGalleryAdapter extends RecyclerView.Adapter<ImageGalleryAdapter.examViewHolder> {

    List<examData> ls = Collections.emptyList();

    Context mContext;

    public ImageGalleryAdapter(List<examData> ls, Context mContext) {
        this.ls = ls;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public examViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View photoView = inflater.inflate(R.layout.exam_card, parent, false);
        examViewHolder viewHolder = new examViewHolder(photoView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull examViewHolder holder, int position) {
        holder.examName.setText(ls.get(position).name);
        holder.examDate.setText(ls.get(position).date);
        holder.examMessage.setText(ls.get(position).message);
    }

    @Override
    public int getItemCount() {
        return ls.size();
    }

    final class examViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView examName;
        TextView examDate;
        TextView examMessage;
        View view;

        public examViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            this.examName = itemView.findViewById(R.id.examName);
            this.examDate = itemView.findViewById(R.id.examDate);
            this.examMessage = itemView.findViewById(R.id.examMessage);
            this.view = itemView;
        }

        @Override
        public void onClick(View v) {
            int clickedPosition = getAdapterPosition();
            examData examData = ls.get(clickedPosition);
            Toast.makeText(v.getContext(), "Bạn đã lựa chọn: " + examData.getName(), Toast.LENGTH_SHORT).show();
        }
    }
}
