package sh.com.pcl.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.blankj.utilcode.util.ToastUtils
import kotlinx.android.synthetic.main.fg_install.*
import sh.com.pcl.R
import sh.com.pcl.common.BaseFragment
import sh.com.pcl.ui.activity.NewAddActivity
import sh.com.pcl.ui.activity.NewHandleActivity
import sh.com.pcl.ui.activity.UserDataActivity

/**
 * Created by Administrator on 2017/10/30.
 */
class InstallFragment : BaseFragment(), View.OnClickListener {

    override fun initData() {
        var list = listOf(bt_qrcode, bt_complete_img, bt_not_complete_img, bt_user_img, bt_record_img)
        for (item in list) {
            item.setOnClickListener(this)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater?.inflate(R.layout.fg_install, null)
        return view
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.bt_qrcode -> startActivity("id", "0", NewAddActivity::class.java)
            R.id.bt_complete_img -> startActivity("id", "1", NewHandleActivity::class.java)
            R.id.bt_not_complete_img -> startActivity("id", "0", NewHandleActivity::class.java)
            R.id.bt_user_img -> startActivity(UserDataActivity::class.java)
            R.id.bt_record_img -> startActivity("id", "1", NewAddActivity::class.java)
        }
    }
}