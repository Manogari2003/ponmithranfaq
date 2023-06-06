package com.example.ponmithranfaq;

import android.app.DownloadManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class faqmodeladapter extends RecyclerView.Adapter<faqmodeladapter.FaqVH> {

    List<faqmodel>faqmodelList;

    public faqmodeladapter(List<faqmodel> faqmodelList) {
        this.faqmodelList = faqmodelList;
    }

    @NonNull
    @Override
    public FaqVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
      return new FaqVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaqVH holder, int position) {
        faqmodel faqmodel=faqmodelList.get(position);
        holder.questiontxt.setText(faqmodel.getQuestion());
        holder.answertxt.setText(faqmodel.getAnswer());
        holder.descriptiontxt.setText(faqmodel.getDescription());

        boolean isexpandable=faqmodelList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isexpandable ? View.VISIBLE: View.GONE);

    }

    @Override
    public int getItemCount() {
        return faqmodelList.size();
    }

    public class FaqVH extends RecyclerView.ViewHolder {

        TextView questiontxt,answertxt,descriptiontxt;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;

        public FaqVH(@NonNull View itemView) {
            super(itemView);

            questiontxt=itemView.findViewById(R.id.qn1);
            answertxt=itemView.findViewById(R.id.ans1);
            descriptiontxt=itemView.findViewById(R.id.des1);

            linearLayout=itemView.findViewById(R.id.linear_layout);
            expandableLayout=itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    faqmodel faqmodel= faqmodelList.get(getAdapterPosition());
                    faqmodel.setExpandable(!faqmodel.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }


}
