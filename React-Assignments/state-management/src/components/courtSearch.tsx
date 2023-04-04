import {
  Table,
  TableBody,
  TableCell,
  TableContainer,
  TableHead,
  TableRow,
  Paper,
  Container,
  Divider,
  Button,
  Typography,
  styled,
} from "@mui/material";
import React from "react";

function createData(search: string, status: string, date: string) {
  return { search, status, date };
}

const MuiButton = styled(Button)({
  color: "darkblue",
  textTransform: "capitalize",
});

const MuiTable = styled(Table)({
  minWidth: 250,
});

const MuiTableCell = styled(TableCell)({
  fontWeight: "bold",
});

const MuiTableRow = styled(TableRow)({
  "&:last-child td, &:last-child th": { border: 0 },
});

const CourtSearch = () => {
  const rows = [
    createData("SSN Verification", "Clear", "2/22/2022"),
    createData("Sex Offender", "Clear", "3/13/2022"),
    createData("Global Watchlist", "Clear", "7/12/2022"),
    createData("Federal Criminal", "Clear", "2/20/2022"),
    createData("SCountry Criminal", "Clear", "5/19/2022"),
  ];

  return (
    <Paper component={Container}>
      <Typography variant="h6" paddingBottom="1rem">
        Court Search
      </Typography>
      <Divider />
      <TableContainer>
        <MuiTable size="small" aria-label="simple table">
          <TableHead>
            <TableRow>
              <MuiTableCell>SEARCH</MuiTableCell>
              <MuiTableCell>STATUS</MuiTableCell>
              <MuiTableCell>DATE</MuiTableCell>
            </TableRow>
          </TableHead>
          <TableBody>
            {rows.map((row) => (
              <MuiTableRow key={row.search}>
                <TableCell component="th" scope="row">
                  <MuiButton>{row.search}</MuiButton>
                </TableCell>
                <TableCell>
                  <Button color="success">{row.status}</Button>
                </TableCell>
                <TableCell>
                  <Typography variant="body1">{row.date}</Typography>
                </TableCell>
              </MuiTableRow>
            ))}
          </TableBody>
        </MuiTable>
      </TableContainer>
    </Paper>
  );
};

export default CourtSearch;

