package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvpretrofit.R;
import com.example.mvpretrofit.RecyclerItemClickListener;

import java.util.ArrayList;
import model.Notice;

public class NoticeAdapter extends RecyclerView.Adapter<NoticeAdapter.NoticeViewHolder> {

    public ArrayList<Notice> dataList;


    public NoticeAdapter(ArrayList<Notice> dataList) {
        this.dataList = dataList;
    }

    @Override
    public NoticeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_row_view, parent, false);
        return new NoticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoticeViewHolder holder, int position) {
        holder.id.setText(dataList.get(position).getId());
        holder.name.setText(dataList.get(position).getName());
        holder.email.setText(dataList.get(position).getEmail());
        holder.gender.setText(dataList.get(position).getGender());

        holder.mobile.setText(dataList.get(position).getContact().getMobile());
        holder.home.setText(dataList.get(position).getContact().getHome());
        holder.office.setText(dataList.get(position).getContact().getOffice());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class NoticeViewHolder extends RecyclerView.ViewHolder {

        public TextView id, name, email, gender, mobile, home, office;

        NoticeViewHolder(View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id);
            name =  itemView.findViewById(R.id.name);
            email =  itemView.findViewById(R.id.email);
            gender =  itemView.findViewById(R.id.gender);
            mobile =  itemView.findViewById(R.id.mobile);
            home =  itemView.findViewById(R.id.home);
            office =  itemView.findViewById(R.id.office);

        }
    }
}