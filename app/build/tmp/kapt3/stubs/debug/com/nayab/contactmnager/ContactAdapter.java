package com.nayab.contactmnager;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/nayab/contactmnager/ContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/nayab/contactmnager/ContactAdapter$ContactViewHolder;", "contactList", "", "Lcom/nayab/contactmnager/BaseContact;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ContactViewHolder", "app_debug"})
public final class ContactAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.nayab.contactmnager.ContactAdapter.ContactViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.nayab.contactmnager.BaseContact> contactList = null;
    
    public ContactAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.nayab.contactmnager.BaseContact> contactList) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.nayab.contactmnager.ContactAdapter.ContactViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nayab.contactmnager.ContactAdapter.ContactViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/nayab/contactmnager/ContactAdapter$ContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/nayab/contactmnager/ContactAdapter;Landroid/view/View;)V", "contactName", "Landroid/widget/TextView;", "getContactName", "()Landroid/widget/TextView;", "contactType", "getContactType", "favoriteIcon", "Landroid/widget/ImageView;", "getFavoriteIcon", "()Landroid/widget/ImageView;", "initialCircle", "getInitialCircle", "profileImage", "getProfileImage", "app_debug"})
    public final class ContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView initialCircle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView contactName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView contactType = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView favoriteIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView profileImage = null;
        
        public ContactViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getInitialCircle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContactName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContactType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFavoriteIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getProfileImage() {
            return null;
        }
    }
}