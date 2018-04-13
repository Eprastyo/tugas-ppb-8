<?xml version="1.0" encoding="utf-8"?>  
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"  
  xmlns:app="http://schemas.android.com/apk/res-auto"  
  xmlns:tools="http://schemas.android.com/tools"  
  android:orientation="vertical"  
  android:layout_width="match_parent"  
  android:layout_height="match_parent"  
  tools:context=".MainActivity"  
  android:background="@mipmap/asd">  
  
    <TextView  
  android:layout_width="fill_parent"  
  android:layout_height="wrap_content"  
  android:text="PEMESANAN BUS : "  
  android:textAlignment="center"  
  android:textSize="12pt"  
  android:textColor="@color/putih"/>  
  
    <TextView  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:text="Pilih kota asal : "  
  android:textSize="6pt"  
  android:textColor="@color/merah"  
  android:background="@color/putih"/>  
  
    <AutoCompleteTextView  
  android:id="@+id/txtKotaAsal"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:textColor="@color/orange"  
  />  
    <TextView  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:text="Pilih kota tujuan : "  
  android:textSize="6pt"  
  android:textColor="@color/merah"  
  android:background="@color/putih"/>  
  
    <AutoCompleteTextView  
  android:id="@+id/txtKotaTujuan"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:textColor="@color/orange"/>  
  
    <TextView  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:text="Pilih tanggal keberangkatan : "  
  android:textSize="6pt"  
  android:textColor="@color/merah"  
  android:background="@color/putih"/>  
    <EditText  
  android:id="@+id/in_date"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:textColor="@color/orange"  
  />  
    <Button  
  android:id="@+id/btn_date"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:text="PILIH TANGGAL"  
  />  
    <TextView  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:text="Piih Jam Keberangkatan :"  
  android:textSize="6pt"  
  android:textColor="@color/merah"  
  android:background="@color/putih"/>  
    <EditText  
  android:id="@+id/in_time"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:textColor="@color/orange"/>  
    <Button  
  android:id="@+id/btn_time"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:text="PILIH WAKTU" />  
    <TextView  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:text="Piih Armada :"  
  android:textSize="6pt"  
  android:textColor="@color/merah"  
  android:background="@color/putih"  
  />  
    <Spinner  
  android:id="@+id/spinner1"  
  android:layout_width="wrap_content"  
  android:layout_height="wrap_content"  
  android:background="@color/putih"/>  
    <Button  
  android:id="@+id/btn_ok"  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:text="PESAN"  
  android:onClick="onClick_Hasil"/>  
</LinearLayout>
