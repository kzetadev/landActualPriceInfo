package com.example.demo.vo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActualPriceInfoVo {
	private String rtms_id;				//실거래가 id
	private String land_cd;				//지번코드
	private String sgg_cd;				//시군구코드
	private String sgg_nm;				//자치구명
	private String bjdong10_cd;			//법정동코드
	private String bjdong_nm;			//법정동명
	private String acc_year;			//신고년도
	private String job_gbn;				//업무구분코드
	private String job_gbn_nm;			//업무구분
	private String deal_ymd;			//계약일자
	private String obj_seqno;			//물건번호
	private String tot_area;			//대치권면적
	private String bldg_area;			//건물면적
	private String right_gbn;			//관리구분코드
	private String flr_info;			//층정보
	private String bldg_muse_cd;		//건물주용도코드
	private String bldg_muse_nm;		//건물주용도
	private String obj_amt;				//물건금액
	private String bldg_nm;				//건물명
	private String build_tear;			//건축년도
}
